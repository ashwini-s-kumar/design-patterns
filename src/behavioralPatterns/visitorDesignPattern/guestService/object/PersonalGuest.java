package behavioralPatterns.visitorDesignPattern.guestService.object;

import behavioralPatterns.visitorDesignPattern.guestService.visitor.Visitor;

public class PersonalGuest extends Guest{

    public PersonalGuest(String name) {
        super(name);
    }

    @Override
    public String greetGuest() {
        return super.greetGuest()+ ": PersonalGuest";
    }

    @Override
    public String serveFood() {
        return super.serveFood() + ": PersonalGuest";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
