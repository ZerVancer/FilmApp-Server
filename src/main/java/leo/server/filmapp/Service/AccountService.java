package leo.server.filmapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leo.server.filmapp.Entity.Account;
import leo.server.filmapp.Repository.AccountRepository;

@Service 
public class AccountService {
  
  @Autowired 
  private AccountRepository accountRepository;

  public Account addAccount(Account user) {
    return accountRepository.save(user);
  }

  public Account getAccount(String name, String password)  {
    return accountRepository.findFirstByNameAndPassword(name, password).orElse(null);
  }

  public Account getAccountById(Integer id) {
    return accountRepository.findById(id).orElse(null);
  }

  public List<Account> getAllAccounts() {
    return accountRepository.findAll();
  }

  public boolean existsAccount(String name) {
    return accountRepository.existsByName(name);
  }
}
