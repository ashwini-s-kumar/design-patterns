package behavioralPatterns.visitorDesignPattern.guestService.object;

import behavioralPatterns.visitorDesignPattern.guestService.visitor.Visitor;

public class CorporateGuest extends Guest{
    public CorporateGuest(String name) {
        super(name);
    }

    @Override
    public String greetGuest() {
        return super.greetGuest()+ ": CorporateGuest";
    }

    @Override
    public String serveFood() {
        return super.serveFood() + ": CorporateGuest";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
