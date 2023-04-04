package behavioralPatterns.mediatorDesignPattern.chatRoom.mediator;

import behavioralPatterns.mediatorDesignPattern.chatRoom.collegue.User;

public interface IChatRoom {
    public void sendMsg(String userId, String msg);
    public void addUser(User user);
}
