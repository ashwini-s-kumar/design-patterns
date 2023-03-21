package behavioralPatterns.chainOfResponsibilityDesignPattern.kingdom.client;

import behavioralPatterns.chainOfResponsibilityDesignPattern.kingdom.request.Request;
import behavioralPatterns.chainOfResponsibilityDesignPattern.kingdom.requestHandlers.Commander;
import behavioralPatterns.chainOfResponsibilityDesignPattern.kingdom.requestHandlers.Officer;
import behavioralPatterns.chainOfResponsibilityDesignPattern.kingdom.requestHandlers.RequestHandler;
import behavioralPatterns.chainOfResponsibilityDesignPattern.kingdom.requestHandlers.Soldier;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class King implements Client{
    List<RequestHandler> requestHandlerList;
    public King(){
        setRequestHandlers();
    }
    @Override
    public void setRequestHandlers() {
        requestHandlerList = new ArrayList<>();
        requestHandlerList.add(new Commander());
        requestHandlerList.add(new Officer());
        requestHandlerList.add(new Soldier());
    }

    @Override
    public void makeRequest(Request request) {
        System.out.println("King is making a request : "+ request.getRequestType());
        requestHandlerList.stream()
                .sorted(Comparator.comparing(RequestHandler::getPriority))
                .filter(requestHandler -> requestHandler.canHandle(request))
                .findFirst()
                .ifPresent(handle -> handle.handle(request));
    }
}
