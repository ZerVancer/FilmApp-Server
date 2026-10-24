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

    Movie m1 = new Movie("Back to the Future", "Marty McFly, a 17-year-old high school student, is accidentally sent 30 years into the past in a time-traveling DeLorean invented by his close friend, the maverick scientist Doc Brown.", "https://www.imdb.com/title/tt0088763/");
    Movie m2 = new Movie("Rental Family", "An American actor in Tokyo struggling to find purpose lands an unusual gig: working for a Japanese \"rental family\" agency, playing stand-in roles for strangers. He rediscovers purpose, belonging, and the beauty of human connection.", "https://www.imdb.com/title/tt14142060/");

    accountService.addAccount(acc1);

    movieService.addMovie(m1);
    movieService.addMovie(m2);

    for (int index = 3; index < 30; index++) {
      movieService.addMovie(new Movie("Movie"+index, "https://www.imdb.com/title/tt0088763/"));
    }

    commentService.addComment(new Comment("Content!", m1, acc1));
    commentService.addComment(new Comment("Content2", m1, acc1));
    commentService.addComment(new Comment("Content3", m2, acc1));
  }
}
