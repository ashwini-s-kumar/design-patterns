package behavioralPatterns.visitorDesignPattern.guestService.visitor;

import behavioralPatterns.visitorDesignPattern.guestService.object.CorporateGuest;
import behavioralPatterns.visitorDesignPattern.guestService.object.FamilyGuest;
import behavioralPatterns.visitorDesignPattern.guestService.object.PersonalGuest;

public class PersonalGuestVisitor implements Visitor{
    @Override
    public void visit(FamilyGuest familyGuest) {

    }

    @Override
    public void visit(PersonalGuest personalGuest) {
        System.out.println("Added gift to personal guest : "+personalGuest.getName());
    }

    @Override
    public void visit(CorporateGuest corporateGuest) {

    }
}
