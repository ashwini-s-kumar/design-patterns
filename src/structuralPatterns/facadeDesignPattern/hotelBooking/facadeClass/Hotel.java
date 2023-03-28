package structuralPatterns.facadeDesignPattern.hotelBooking.facadeClass;

import structuralPatterns.facadeDesignPattern.hotelBooking.Room;
import structuralPatterns.facadeDesignPattern.hotelBooking.subClass.PaymentService;
import structuralPatterns.facadeDesignPattern.hotelBooking.subClass.RoomAllocationService;
import structuralPatterns.facadeDesignPattern.hotelBooking.subClass.RoomBookingService;

public class Hotel {
    private RoomBookingService roomBookingService;
    private PaymentService paymentService;
    private RoomAllocationService roomAllocationService;

    public Hotel(){
        roomBookingService = new RoomBookingService();
        paymentService = new PaymentService();
        roomAllocationService = new RoomAllocationService();
    }

    public void bookRoom(int numOfGuest, int numOfDays){
        Room room = roomAllocationService.isRoomAvailable(numOfGuest);
        if(room!= null){
            System.out.println("Room is Available !!");
            paymentService.makePayment(numOfDays);
            roomAllocationService.allocateRoom(room, paymentService);
        }
        else{
            System.out.println("Sorry, Room not available.");
        }
    }
}
