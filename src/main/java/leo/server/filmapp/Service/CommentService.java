package leo.server.filmapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leo.server.filmapp.Entity.Comment;
import leo.server.filmapp.Repository.CommentRepository;

@Service 
public class CommentService {

  @Autowired 
  private CommentRepository commentRepository;

  public Comment addComment(Comment comment) {
    return commentRepository.save(comment);
  }

  public Comment putComment(Integer id, Comment comment) {
    boolean exists = commentRepository.existsById(id);

    if (exists) {
      return null;
    }

    return commentRepository.save(comment);
  }

  public Comment patchComment(Integer id, Comment comment) {
    Comment old = commentRepository.findById(id).orElse(null);

    old.setContent(comment.getContent());

    Comment updated = commentRepository.save(old);

    return updated;
  }

  public Comment deleteComment(Integer id) {
    Comment deleted = commentRepository.findById(id).orElse(null);

    commentRepository.deleteById(id);

    if (commentRepository.existsById(id)) {
      return null;
    }

    return deleted;
  }

  public List<Comment> getCommentsByMovieId(Integer movieId) {
    return commentRepository.findAllByMovieId(movieId);
  }
  
}
