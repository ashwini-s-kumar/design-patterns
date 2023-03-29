package behavioralPatterns.visitorDesignPattern.guestService.visitor;

import behavioralPatterns.visitorDesignPattern.guestService.object.CorporateGuest;
import behavioralPatterns.visitorDesignPattern.guestService.object.FamilyGuest;
import behavioralPatterns.visitorDesignPattern.guestService.object.PersonalGuest;

public interface Visitor {
    void visit(FamilyGuest familyGuest);
    void visit(PersonalGuest personalGuest);
    void visit(CorporateGuest corporateGuest);
}
