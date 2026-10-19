package leo.server.filmapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import leo.server.filmapp.Entity.Comment;

@Repository 
public interface CommentRepository extends JpaRepository<Comment, Integer> {
  List<Comment> findAllByMovieId(Integer movieId);
}
