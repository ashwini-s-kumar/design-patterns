package InterviewQuestions.MovieTicketBookingSystem;

import InterviewQuestions.MovieTicketBookingSystem.Controller.MovieController;
import InterviewQuestions.MovieTicketBookingSystem.Controller.TheaterController;
import InterviewQuestions.MovieTicketBookingSystem.Enum.SeatCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DriverClass {

  static MovieController movieController = new MovieController();
  static TheaterController theaterController = new TheaterController();

  public static void main(String [] arr){
    initialise();

    createBooking("Bangalore", "3 Idiots");
  }

  private static void createBooking(String city, String movieName) {
    // user see movie by city
    Map<String, List<Movie>> moviesByCity =  movieController.getMoviesByCity();
    List<Movie> movies = moviesByCity.get(city);

    // select a movie
    Movie movie = movies.get(0);

    // Select theater by city
    Map<String, List<Theater>> theatersByCity = theaterController.getTheatersByCity();
    List<Theater> theaters = theatersByCity.get(city);
    Theater theater = theaters.get(0);

    // select a show by movie
    List<Show> shows = theater.getShows();
    Show show = null;
    for(Show show1 : shows){
      Movie movie1 = show1.getMovie();
      if(movie1.movieName.equals(movieName)){
        show = show1;
        break;
      }
    }

    int interestedSeat = 20;
    List<Seat> myBookedSeats = new ArrayList<>();
    List<Integer> alreadyBookedSeats = show.getBookedSeats();
    if(!alreadyBookedSeats.contains( interestedSeat)){
      alreadyBookedSeats.add(interestedSeat);

      Booking booking = new Booking();
      booking.setShow(show);
      // check if the seat exists in screen

      List<Seat> availableSeats = show.getScreen().getSeats();
      for(Seat seat: availableSeats){
        if(seat.seatId == interestedSeat){
          myBookedSeats.add(seat);
        }
      }
      booking.setSeats(myBookedSeats);

      System.out.println("Booking Successful !!");


    }else{
      // error : se;ect another seat
      System.out.println("Select another seat");
    }


  }

  private static void initialise() {
    // create movies
    Movie movie1 = new Movie(1, "3 Idiots", 3);
    Movie movie2 = new Movie(2, "Avengers", 2);

    movieController.addMovie( movie1, "Bangalore");
    movieController.addMovie(movie2, "Bangalore");
    movieController.addMovie(movie1, "Mumbai");


    Seat seat1 = new Seat(20, 3, SeatCategory.GOLD, 100);
    Seat seat2 = new Seat(21, 3, SeatCategory.GOLD, 100);
    Seat seat3 = new Seat(22, 3, SeatCategory.GOLD, 100);
    List<Seat> seats = new ArrayList<>();
    seats.add(seat1);
    seats.add(seat2);
    seats.add(seat3);

    Screen screen = new Screen(1, seats);
    List<Screen> screens = new ArrayList<>();
    screens.add(screen);

    Show show1 = new Show(1, movie1, screen, 9, new ArrayList<>());
    Show show2 = new Show(1, movie1, screen, 5, new ArrayList<>());
    List<Show> shows = new ArrayList<>();
    shows.add(show1);
    shows.add(show2);

    // create theater 1
    Theater theater1 = new Theater(1001, "Bangalore", screens, shows);
    theaterController.addTheaters(theater1, "Bangalore");

    // create theater 2
    Theater theater2 = new Theater(1002, "Mumbai", screens, shows);
    theaterController.addTheaters(theater2, "Mumbai");
  }
}
