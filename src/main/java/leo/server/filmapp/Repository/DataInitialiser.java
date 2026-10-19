package leo.server.filmapp.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import leo.server.filmapp.Entity.Account;
import leo.server.filmapp.Entity.Comment;
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
    Account acc1 = new Account("TEST1", "T1");

    Movie m1 = new Movie("Movie1");
    Movie m2 = new Movie("Movie2");

    accountService.addAccount(acc1);

    movieService.addMovie(m1);
    movieService.addMovie(m2);
    movieService.addMovie(new Movie("Movie3"));
    movieService.addMovie(new Movie("Movie4"));
    movieService.addMovie(new Movie("Movie5"));
    movieService.addMovie(new Movie("Movie6"));
    movieService.addMovie(new Movie("Movie7"));
    movieService.addMovie(new Movie("Movie8"));
    movieService.addMovie(new Movie("Movie9"));
    movieService.addMovie(new Movie("Movie10"));

    commentService.addComment(new Comment("Content!", m1, acc1));
    commentService.addComment(new Comment("Content2", m1, acc1));
    commentService.addComment(new Comment("Content3", m2, acc1));
  }
}
