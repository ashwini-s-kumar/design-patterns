package behavioralPatterns.chainOfResponsibilityDesignPattern.kingdom.client;

import behavioralPatterns.chainOfResponsibilityDesignPattern.kingdom.request.Request;

public interface Client {
    public void setRequestHandlers();
    public void makeRequest(Request request);
}
