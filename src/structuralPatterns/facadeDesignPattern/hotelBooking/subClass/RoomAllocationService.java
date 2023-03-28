package structuralPatterns.facadeDesignPattern.hotelBooking.subClass;

import structuralPatterns.facadeDesignPattern.hotelBooking.Room;

public class RoomAllocationService {
    public Room isRoomAvailable(int numOfGuest){
        Room room = null;
        if(numOfGuest < 3){
            room = new Room(1,10000,numOfGuest);
        }
        return room;
    }

    public void allocateRoom(Room room, PaymentService paymentService){
        if(paymentService.isPaymentComplete()) {
            System.out.println(room.toString() + " is allocated !!");
        }else{
            System.out.println("Payment is pending. So "+ room.toString() + " , can not be allocated.");
        }
    }
}
