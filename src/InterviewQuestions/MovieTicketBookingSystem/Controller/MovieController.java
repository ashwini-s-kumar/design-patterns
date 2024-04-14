package InterviewQuestions.MovieTicketBookingSystem.Controller;

import InterviewQuestions.MovieTicketBookingSystem.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
  Map<String, List<Movie>> moviesByCity =  new HashMap<>();
  List<Movie> allMovies = new ArrayList<>();

  // add movies
  public void addMovie(Movie movie, String city){
    allMovies.add(movie);

    List<Movie> movies = moviesByCity.get(city);
    if(movies == null){
      movies = new ArrayList<>();
    }
    movies.add(movie);
    moviesByCity.put(city, movies);
  }

  public Map<String, List<Movie>> getMoviesByCity() {
    return moviesByCity;
  }

  public void setMoviesByCity(Map<String, List<Movie>> moviesByCity) {
    this.moviesByCity = moviesByCity;
  }

  public List<Movie> getAllMovies() {
    return allMovies;
  }

  public void setAllMovies(List<Movie> allMovies) {
    this.allMovies = allMovies;
  }
}
