package behavioralPatterns.visitorDesignPattern.guestService.visitor;

import behavioralPatterns.visitorDesignPattern.guestService.object.CorporateGuest;
import behavioralPatterns.visitorDesignPattern.guestService.object.FamilyGuest;
import behavioralPatterns.visitorDesignPattern.guestService.object.PersonalGuest;

public class FamilyGuestVisitor implements Visitor{
    @Override
    public void visit(FamilyGuest familyGuest) {
        System.out.println("Added gift to family guest : "+familyGuest.getName());
    }

    @Override
    public void visit(PersonalGuest personalGuest) {

    }

    @Override
    public void visit(CorporateGuest corporateGuest) {

    }

}
