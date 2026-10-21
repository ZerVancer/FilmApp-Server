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

    for (int index = 3; index < 30; index++) {
      movieService.addMovie(new Movie("Movie"+index));
    }

    commentService.addComment(new Comment("Content!", m1, acc1));
    commentService.addComment(new Comment("Content2", m1, acc1));
    commentService.addComment(new Comment("Content3", m2, acc1));
  }
}
