package leo.server.filmapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Data 
@Getter 
@Setter 
@NoArgsConstructor 
public class Movie {
  @Id 
  @GeneratedValue 
  private Integer id;
  private String title;
  private String details;
  private String imdbLink;

  public Movie(String title, String imdbLink) {
    this.title = title;
    this.details = "";
    this.imdbLink = imdbLink;
  }

  public Movie(String title, String details, String imdbLink) {
    this.title = title;
    this.details = details;
    this.imdbLink = imdbLink;
  }
}
