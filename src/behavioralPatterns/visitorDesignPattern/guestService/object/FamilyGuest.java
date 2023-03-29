package behavioralPatterns.visitorDesignPattern.guestService.object;

import behavioralPatterns.visitorDesignPattern.guestService.visitor.Visitor;

public class FamilyGuest extends Guest{
    public FamilyGuest(String name) {
        super(name);
    }

    @Override
    public String greetGuest() {
        return super.greetGuest()+ ": FamilyGuest";
    }

    @Override
    public String serveFood() {
        return super.serveFood() + ": FamilyGuest";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
