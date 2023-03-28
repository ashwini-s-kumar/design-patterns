package structuralPatterns.facadeDesignPattern.hotelBooking;

import structuralPatterns.facadeDesignPattern.hotelBooking.facadeClass.Hotel;

public class HotelBookingApp {
    public static void main(String [] arr){
        Hotel hotel = new Hotel();
        hotel.bookRoom(2, 5);
        System.out.println("=======================================");
        hotel.bookRoom(6, 1);
        System.out.println("=======================================");
        hotel.bookRoom(1, 15);
    }
}
