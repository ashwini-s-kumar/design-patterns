package InterviewQuestions.MovieTicketBookingSystem;

import java.util.Date;
import java.util.List;

public class Show {

  int showId;
  Movie movie;
  Screen screen;

  int  startTime;

  List<Integer> bookedSeats;

  public Show(int showId, Movie movie, Screen screen, int startTime, List<Integer> bookedSeats) {
    this.showId = showId;
    this.movie = movie;
    this.screen = screen;
    this.startTime = startTime;
    this.bookedSeats = bookedSeats;
  }



  public int getShowId() {
    return showId;
  }

  public void setShowId(int showId) {
    this.showId = showId;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public Screen getScreen() {
    return screen;
  }

  public void setScreen(Screen screen) {
    this.screen = screen;
  }

  public int getStartTime() {
    return startTime;
  }

  public void setStartTime(int startTime) {
    this.startTime = startTime;
  }

  public List<Integer> getBookedSeats() {
    return bookedSeats;
  }

  public void setBookedSeats(List<Integer> bookedSeats) {
    this.bookedSeats = bookedSeats;
  }
}
