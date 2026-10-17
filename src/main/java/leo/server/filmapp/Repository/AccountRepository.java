package leo.server.filmapp.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import leo.server.filmapp.Entity.Account;

@Repository 
public interface AccountRepository extends JpaRepository<Account, Integer> {
  Optional<Account> findFirstByNameAndPassword(String name, String password);  
  boolean existsByName(String name);
}
