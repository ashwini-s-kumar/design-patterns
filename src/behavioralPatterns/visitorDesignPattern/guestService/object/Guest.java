package behavioralPatterns.visitorDesignPattern.guestService.object;

import behavioralPatterns.visitorDesignPattern.guestService.visitor.Visitor;

public abstract class Guest {
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    public String greetGuest(){
        return " Hi " + name + " , Welcome !!";
        }
    public String serveFood(){
        return "Served food to "+ name;
    }

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
