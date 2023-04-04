package behavioralPatterns.mediatorDesignPattern.chatRoom.collegue;

import behavioralPatterns.mediatorDesignPattern.chatRoom.mediator.IChatRoom;

public abstract class User {
    private IChatRoom mediator;
    private String id;

    private String name;

    public User(IChatRoom mediator, String id, String name) {
        this.mediator = mediator;
        this.id = id;
        this.name = name;
    }


    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);

    public IChatRoom getMediator(){
        return  this.mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
