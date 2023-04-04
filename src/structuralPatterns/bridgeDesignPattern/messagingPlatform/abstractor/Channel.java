package structuralPatterns.bridgeDesignPattern.messagingPlatform.abstractor;

import structuralPatterns.bridgeDesignPattern.messagingPlatform.implementor.MessageSender;

public abstract class Channel {
    protected MessageSender messageSender;

    public Channel(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void sendMessage(String msgType, String recipient, String msg);
}
