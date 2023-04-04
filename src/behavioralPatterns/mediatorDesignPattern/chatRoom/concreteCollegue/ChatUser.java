package behavioralPatterns.mediatorDesignPattern.chatRoom.concreteCollegue;

import behavioralPatterns.mediatorDesignPattern.chatRoom.collegue.User;
import behavioralPatterns.mediatorDesignPattern.chatRoom.mediator.IChatRoom;

public class ChatUser extends User {

    public ChatUser(IChatRoom mediator, String id, String name) {
        super(mediator, id, name);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + " sending msg : "+ msg);
        this.getMediator().sendMsg(userId, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() +" received msg : " + msg);
    }
}
