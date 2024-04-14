package InterviewQuestions.MovieTicketBookingSystem;

import java.util.List;

public class Theater {
  int theaterId;

  String city;

  List<Screen> screens;

  List<Show> shows;

  public Theater(int theaterId, String city, List<Screen> screens, List<Show> shows) {
    this.theaterId = theaterId;
    this.city = city;
    this.screens = screens;
    this.shows = shows;
  }

  public int getTheaterId() {
    return theaterId;
  }

  public void setTheaterId(int theaterId) {
    this.theaterId = theaterId;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public List<Screen> getScreens() {
    return screens;
  }

  public void setScreens(List<Screen> screens) {
    this.screens = screens;
  }

  public List<Show> getShows() {
    return shows;
  }

  public void setShows(List<Show> shows) {
    this.shows = shows;
  }
}
