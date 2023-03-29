package behavioralPatterns.visitorDesignPattern.guestService;

import behavioralPatterns.visitorDesignPattern.guestService.object.CorporateGuest;
import behavioralPatterns.visitorDesignPattern.guestService.object.FamilyGuest;
import behavioralPatterns.visitorDesignPattern.guestService.object.Guest;
import behavioralPatterns.visitorDesignPattern.guestService.object.PersonalGuest;
import behavioralPatterns.visitorDesignPattern.guestService.visitor.CorporateGuestVisitor;
import behavioralPatterns.visitorDesignPattern.guestService.visitor.FamilyGuestVisitor;
import behavioralPatterns.visitorDesignPattern.guestService.visitor.Visitor;

public class Demo {
    public static void main(String [] arr){

        Guest guest1 = new FamilyGuest("Yeshwanth");
        System.out.println(guest1.greetGuest());
        System.out.println(guest1.serveFood());

        Guest guest2 = new PersonalGuest("Friend");
        System.out.println(guest2.greetGuest());
        System.out.println(guest2.serveFood());

        Guest guest3 = new CorporateGuest("Coluege");
        System.out.println(guest3.greetGuest());
        System.out.println(guest3.serveFood());

        Visitor visitor = new FamilyGuestVisitor();
        guest1.accept(visitor);
        guest2.accept(visitor);
        guest3.accept(visitor);

        visitor = new CorporateGuestVisitor();
        guest1.accept(visitor);
        guest2.accept(visitor);
        guest3.accept(visitor);

        visitor = new FamilyGuestVisitor();
        guest1.accept(visitor);
        guest2.accept(visitor);
        guest3.accept(visitor);
    }
}
