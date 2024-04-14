package InterviewQuestions.MovieTicketBookingSystem.Controller;

import InterviewQuestions.MovieTicketBookingSystem.Movie;
import InterviewQuestions.MovieTicketBookingSystem.Theater;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
  Map<String, List<Theater>> theatersByCity =  new HashMap<>();
  List<Theater> allTheaters = new ArrayList<>();

  // add theaters
  public void addTheaters(Theater theater, String city){
    allTheaters.add(theater);

    List<Theater> theaters = theatersByCity.get(city);
    if(theaters == null){
      theaters = new ArrayList<>();
    }
    theaters.add(theater);
    theatersByCity.put(city, theaters);
  }

  public Map<String, List<Theater>> getTheatersByCity() {
    return theatersByCity;
  }

  public void setTheatersByCity(Map<String, List<Theater>> theatersByCity) {
    this.theatersByCity = theatersByCity;
  }

  public List<Theater> getAllTheaters() {
    return allTheaters;
  }

  public void setAllTheaters(List<Theater> allTheaters) {
    this.allTheaters = allTheaters;
  }
}
