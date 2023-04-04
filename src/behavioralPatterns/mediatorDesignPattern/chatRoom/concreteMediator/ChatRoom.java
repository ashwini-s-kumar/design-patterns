package behavioralPatterns.mediatorDesignPattern.chatRoom.concreteMediator;

import behavioralPatterns.mediatorDesignPattern.chatRoom.collegue.User;
import behavioralPatterns.mediatorDesignPattern.chatRoom.mediator.IChatRoom;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IChatRoom {

    Map<String , User > userMap = new HashMap<>();
    @Override
    public void sendMsg(String userId, String msg) {
        User user = userMap.get(userId);
        user.receive(msg);
    }

    @Override
    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }
}
