package chainOfResponsibilityDesignPattern.kingdom.requestHandlers;

import chainOfResponsibilityDesignPattern.kingdom.request.Request;
import chainOfResponsibilityDesignPattern.kingdom.request.RequestType;

public class Soldier implements RequestHandler{
    @Override
    public boolean canHandle(Request request) {
        if(request.getRequestType().equals(RequestType.WATCH_GATE)){
            return true;
        }
        return false;
    }

    @Override
    public int getPriority() {
        return 3;
    }

    @Override
    public void handle(Request request) {
        request.markHandled();
        System.out.println(requestHandlerDetails());
        System.out.println(request.getRequestType() + " is handled by Soldier");
    }

    @Override
    public String requestHandlerDetails() {
        return "The RequestHandler is Soldier";
    }
}
