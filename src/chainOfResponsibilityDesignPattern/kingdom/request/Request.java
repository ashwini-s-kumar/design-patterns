package chainOfResponsibilityDesignPattern.kingdom.request;

public class Request {
    private RequestType requestType;
    private String requestDescription;
    private boolean handled;

    public Request(RequestType requestType, String requestDescription){
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public void markHandled(){
        this.handled = true;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public boolean isHandled() {
        return handled;
    }
}
