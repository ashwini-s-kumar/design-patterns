package behavioralPatterns.chainOfResponsibilityDesignPattern.kingdom.requestHandlers;

import behavioralPatterns.chainOfResponsibilityDesignPattern.kingdom.request.Request;

public interface RequestHandler {
    public boolean canHandle(Request request);
    public int getPriority();
    public void handle(Request request);
    public String requestHandlerDetails();
}
