package InterviewQuestions.MovieTicketBookingSystem;

public class Movie {
  int movieId;
  String movieName;
  int durationInHours;

  public Movie(int movieId, String movieName, int durationInHours) {
    this.movieId = movieId;
    this.movieName = movieName;
    this.durationInHours = durationInHours;
  }

  public int getMovieId() {
    return movieId;
  }

  public void setMovieId(int movieId) {
    this.movieId = movieId;
  }

  public String getMovieName() {
    return movieName;
  }

  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }

  public int getDurationInHours() {
    return durationInHours;
  }

  public void setDurationInHours(int durationInHours) {
    this.durationInHours = durationInHours;
  }
}
