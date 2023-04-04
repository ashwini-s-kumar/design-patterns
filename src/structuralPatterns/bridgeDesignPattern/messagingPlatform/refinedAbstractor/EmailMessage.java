package structuralPatterns.bridgeDesignPattern.messagingPlatform.refinedAbstractor;

import structuralPatterns.bridgeDesignPattern.messagingPlatform.abstractor.Channel;
import structuralPatterns.bridgeDesignPattern.messagingPlatform.implementor.MessageSender;

public class EmailMessage extends Channel {

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void sendMessage(String msgType, String recipient, String msg) {
        messageSender.sendMessage( msgType,  recipient,  msg);
    }
}
