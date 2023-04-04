package structuralPatterns.bridgeDesignPattern.messagingPlatform.concreteImplementor;

import structuralPatterns.bridgeDesignPattern.messagingPlatform.implementor.MessageSender;

public class MessageSenderImpl implements MessageSender {
    @Override
    public void sendMessage(String msgType, String recipient, String msg) {
        System.out.println("Sending " + msgType + " message to " + recipient + ": " + msg);
    }
}
