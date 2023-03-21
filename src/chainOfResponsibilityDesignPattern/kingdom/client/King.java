package chainOfResponsibilityDesignPattern.kingdom.client;

import chainOfResponsibilityDesignPattern.kingdom.request.Request;
import chainOfResponsibilityDesignPattern.kingdom.requestHandlers.Commander;
import chainOfResponsibilityDesignPattern.kingdom.requestHandlers.Officer;
import chainOfResponsibilityDesignPattern.kingdom.requestHandlers.RequestHandler;
import chainOfResponsibilityDesignPattern.kingdom.requestHandlers.Soldier;

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
