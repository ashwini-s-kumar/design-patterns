package chainOfResponsibilityDesignPattern.kingdom.requestHandlers;

import chainOfResponsibilityDesignPattern.kingdom.request.Request;
import chainOfResponsibilityDesignPattern.kingdom.request.RequestType;

public class Officer implements RequestHandler{
    @Override
    public boolean canHandle(Request request) {
        if(request.getRequestType().equals(RequestType.COLLECT_TAX) ||
        request.getRequestType().equals(RequestType.WATER_HYGIENE)){
            return true;
        }
        return false;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(Request request) {
        request.markHandled();
        System.out.println(requestHandlerDetails());
        System.out.println(request.getRequestType() + " is handled by Officer");
    }

    @Override
    public String requestHandlerDetails() {
        return "The RequestHandler is Officer";
    }
}
