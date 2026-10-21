package leo.server.filmapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import leo.server.filmapp.Entity.Account;
import leo.server.filmapp.Service.AccountService;

@RestController 
@RequestMapping("/account")
public class AccountController {

  @Autowired 
  private AccountService accountService;

  @PostMapping("/register")
  public ResponseEntity<Account> addAccount(@RequestBody Account account) {
    Account saved = accountService.addAccount(account);

    return ResponseEntity.ok(saved);
  }

  @GetMapping ("/login={name}/{password}")
  public ResponseEntity<Account> getAccount(@PathVariable String name, @PathVariable String password) {
    Account saved = accountService.getAccount(name, password);

    return ResponseEntity.ok(saved);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Account> getAccountById(@PathVariable Integer id) {
    Account gotten = accountService.getAccountById(id);

    return ResponseEntity.ok(gotten);
  }

  @GetMapping("/all")
  public ResponseEntity<List<Account>> getAllAccounts() {
    List<Account> list = accountService.getAllAccounts();

    return ResponseEntity.ok(list);
  }
}
