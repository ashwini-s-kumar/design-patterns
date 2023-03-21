package chainOfResponsibilityDesignPattern.kingdom.requestHandlers;

import chainOfResponsibilityDesignPattern.kingdom.request.Request;
import chainOfResponsibilityDesignPattern.kingdom.request.RequestType;

public interface RequestHandler {
    public boolean canHandle(Request request);
    public int getPriority();
    public void handle(Request request);
    public String requestHandlerDetails();
}
