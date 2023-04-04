package structuralPatterns.bridgeDesignPattern.messagingPlatform;

import structuralPatterns.bridgeDesignPattern.messagingPlatform.abstractor.Channel;
import structuralPatterns.bridgeDesignPattern.messagingPlatform.concreteImplementor.MessageSenderImpl;
import structuralPatterns.bridgeDesignPattern.messagingPlatform.implementor.MessageSender;
import structuralPatterns.bridgeDesignPattern.messagingPlatform.refinedAbstractor.EmailMessage;
import structuralPatterns.bridgeDesignPattern.messagingPlatform.refinedAbstractor.SmsMessage;
import structuralPatterns.bridgeDesignPattern.messagingPlatform.refinedAbstractor.WhatsAppMessage;

public class Client {
    public static void main(String [] arr ) {
        MessageSender messageSender = new MessageSenderImpl();

        Channel sms = new SmsMessage(messageSender);
        sms.sendMessage("SMS" , "ashwini" , "Hi Ashwini");

        Channel email = new EmailMessage(messageSender);
        email.sendMessage("Email" , "ashwini" , "Hi Ashwini");

        Channel whatsApp = new WhatsAppMessage(messageSender);
        whatsApp.sendMessage("SMS" , "ashwini" , "Hi Ashwini");
    }
}
