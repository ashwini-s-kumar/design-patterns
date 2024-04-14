package InterviewQuestions.MovieTicketBookingSystem;

import InterviewQuestions.MovieTicketBookingSystem.Enum.SeatCategory;

public class Seat {

  int seatId;
  int rowNum;
  SeatCategory seatCategory;

  int price;

  public Seat(int seatId, int rowNum, SeatCategory seatCategory, int price) {
    this.seatId = seatId;
    this.rowNum = rowNum;
    this.seatCategory = seatCategory;
    this.price = price;
  }

  public int getSeatId() {
    return seatId;
  }

  public void setSeatId(int seatId) {
    this.seatId = seatId;
  }

  public int getRowNum() {
    return rowNum;
  }

  public void setRowNum(int rowNum) {
    this.rowNum = rowNum;
  }

  public SeatCategory getSeatCategory() {
    return seatCategory;
  }

  public void setSeatCategory(SeatCategory seatCategory) {
    this.seatCategory = seatCategory;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
