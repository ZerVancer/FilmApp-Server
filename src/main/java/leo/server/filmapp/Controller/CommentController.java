package leo.server.filmapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import leo.server.filmapp.Entity.Comment;
import leo.server.filmapp.Service.CommentService;

@RestController 
@RequestMapping("/comment")
public class CommentController {

  @Autowired 
  private CommentService commentService;

  @PostMapping("")
  public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
    Comment saved = commentService.addComment(comment);

    return ResponseEntity.ok(saved);
  }
  
  @PutMapping ("/{id}")
  public ResponseEntity<Comment> addComment(@PathVariable Integer id, @RequestBody Comment comment) {
    Comment saved = commentService.putComment(id, comment);

    return ResponseEntity.ok(saved);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Comment> deleteComment(@PathVariable Integer id) {
    Comment deleted = commentService.deleteComment(id);

    return ResponseEntity.ok(deleted);
  }
  
  @GetMapping("/{movieId}")
  public ResponseEntity<List<Comment>> getCommentsByMovieId(@PathVariable Integer movieId) {
    List<Comment> list = commentService.getCommentsByMovieId(movieId);

    return ResponseEntity.ok(list);
  }
}
