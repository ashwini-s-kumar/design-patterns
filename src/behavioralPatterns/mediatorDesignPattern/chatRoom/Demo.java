package behavioralPatterns.mediatorDesignPattern.chatRoom;

import behavioralPatterns.mediatorDesignPattern.chatRoom.collegue.User;
import behavioralPatterns.mediatorDesignPattern.chatRoom.concreteCollegue.ChatUser;
import behavioralPatterns.mediatorDesignPattern.chatRoom.concreteMediator.ChatRoom;
import behavioralPatterns.mediatorDesignPattern.chatRoom.mediator.IChatRoom;

public class Demo {
    public static void main(String [] arrs){
        IChatRoom chatroom = new ChatRoom();

        User user1 = new ChatUser(chatroom,"1", "Alex");
        User user2 = new ChatUser(chatroom,"2", "Brian");
        User user3 = new ChatUser(chatroom,"3", "Charles");
        User user4 = new ChatUser(chatroom,"4", "David");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        user1.send("Hello brian", "2");
        user2.send("Hey buddy", "1");
    }
}
