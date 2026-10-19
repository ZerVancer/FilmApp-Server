package leo.server.filmapp.Entity;

import jakarta.persistence.Column;
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
public class Account {
  @Id 
  @GeneratedValue 
  private Integer id;
  @Column(unique=true)
  private String name;
  private String password;

  public Account(String name, String password) {
    this.name = name;
    this.password = password;
  }
}
