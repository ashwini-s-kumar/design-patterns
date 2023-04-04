package structuralPatterns.bridgeDesignPattern.messagingPlatform.implementor;

public interface MessageSender {
    void sendMessage(String msgType, String recipient, String msg);
}
