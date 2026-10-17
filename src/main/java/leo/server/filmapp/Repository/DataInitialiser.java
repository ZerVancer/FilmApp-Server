package leo.server.filmapp.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import leo.server.filmapp.Entity.Movie;
import leo.server.filmapp.Service.AccountService;
import leo.server.filmapp.Service.CommentService;
import leo.server.filmapp.Service.MovieService;

@Component 
public class DataInitialiser implements CommandLineRunner {
  
  @Autowired 
  AccountService accountService;

  @Autowired 
  MovieService movieService;

  @Autowired 
  CommentService commentService;

  @Override
  public void run(String... args) throws Exception {
    movieService.addMovie(new Movie("Movie1"));
    movieService.addMovie(new Movie("Movie2"));
    movieService.addMovie(new Movie("Movie3"));
    movieService.addMovie(new Movie("Movie4"));
    movieService.addMovie(new Movie("Movie5"));
    movieService.addMovie(new Movie("Movie6"));
    movieService.addMovie(new Movie("Movie7"));
    movieService.addMovie(new Movie("Movie8"));
    movieService.addMovie(new Movie("Movie9"));
    movieService.addMovie(new Movie("Movie10"));
  }
}
