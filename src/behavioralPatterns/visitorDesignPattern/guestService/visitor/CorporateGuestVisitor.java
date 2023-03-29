package behavioralPatterns.visitorDesignPattern.guestService.visitor;

import behavioralPatterns.visitorDesignPattern.guestService.object.CorporateGuest;
import behavioralPatterns.visitorDesignPattern.guestService.object.FamilyGuest;
import behavioralPatterns.visitorDesignPattern.guestService.object.PersonalGuest;

public class CorporateGuestVisitor implements Visitor{
    @Override
    public void visit(FamilyGuest familyGuest) {

    }

    @Override
    public void visit(PersonalGuest personalGuest) {

    }

    @Override
    public void visit(CorporateGuest corporateGuest) {
        System.out.println("Added gift to corporate guest : "+corporateGuest.getName());
    }
}
