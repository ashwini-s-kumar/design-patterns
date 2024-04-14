package InterviewQuestions.MovieTicketBookingSystem;

import java.util.List;

public class Booking {
  Show show;
  List<Seat> seats;

  Payment payment;

  public Show getShow() {
    return show;
  }

  public void setShow(Show show) {
    this.show = show;
  }

  public List<Seat> getSeats() {
    return seats;
  }

  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }

  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }
}
