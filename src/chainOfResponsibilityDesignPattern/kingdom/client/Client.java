package chainOfResponsibilityDesignPattern.kingdom.client;

import chainOfResponsibilityDesignPattern.kingdom.request.Request;

public interface Client {
    public void setRequestHandlers();
    public void makeRequest(Request request);
}
