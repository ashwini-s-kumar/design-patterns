package structuralPatterns.facadeDesignPattern.hotelBooking;

public class Room {
    private int roomNum;
    private int price;
    private int numOfGuest;

    public Room(int roomNum, int price, int numOfGuest) {
        this.roomNum = roomNum;
        this.price = price;
        this.numOfGuest = numOfGuest;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public int getPrice() {
        return price;
    }

    public int getNumOfGuest() {
        return numOfGuest;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNum=" + roomNum +
                ", price=" + price +
                ", numOfGuest=" + numOfGuest +
                '}';
    }
}
