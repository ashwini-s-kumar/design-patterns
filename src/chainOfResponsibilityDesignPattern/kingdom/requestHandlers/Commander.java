package chainOfResponsibilityDesignPattern.kingdom.requestHandlers;

import chainOfResponsibilityDesignPattern.kingdom.request.Request;
import chainOfResponsibilityDesignPattern.kingdom.request.RequestType;

public class Commander implements RequestHandler{
    @Override
    public boolean canHandle(Request request) {
        if(request.getRequestType().equals(RequestType.LEAD_WAR) ||
                request.getRequestType().equals(RequestType.PUNISH_CULPRIT) ||
                request.getRequestType().equals(RequestType.SAFETY_RULES)){
            return true;
        }
        return false;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(Request request) {
        request.markHandled();
        System.out.println(requestHandlerDetails());
        System.out.println(request.getRequestType() + " is handled by Commander");
    }

    @Override
    public String requestHandlerDetails() {
        return "The RequestHandler is commander";
    }
}
