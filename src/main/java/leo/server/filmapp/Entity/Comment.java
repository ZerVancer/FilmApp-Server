package leo.server.filmapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Data
@Getter 
@Setter 
@NoArgsConstructor
public class Comment {
    @Id 
    @GeneratedValue 
    private Integer id;
    private String content;
    @ManyToOne
    @JoinColumn(name = "movieId", referencedColumnName = "id")
    private Movie movie;
    @ManyToOne
    @JoinColumn(name = "accountId", referencedColumnName = "id")
    private Account account;

    public Comment(String content, Movie movie, Account account) {
        this.content = content;
        this.movie = movie;
        this.account = account;
    }
}