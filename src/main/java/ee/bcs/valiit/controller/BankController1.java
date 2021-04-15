package ee.bcs.valiit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BankController1 {

    private static Map<String, BankAccountInfo> accountBalanceMap = new HashMap<>();

    // Create account
    //   http://localhost:8081/createAccount1/Mari/EE123/100
    @GetMapping("createAccount1/{ownerName}/{accountNr}/{balance}")
    public void createAccount1(@PathVariable("ownerName") String ownerName,
                              @PathVariable("accountNr") String accountNr,
                              @PathVariable("balance") double balance) {
        BankAccountInfo account = new BankAccountInfo();
        account.setOwnerName(ownerName);
        account.setAccountNr(accountNr);
        account.setBalance(balance);
        accountBalanceMap.put(accountNr, account);
    }

    // Get balance
    //   http://localhost:8081/getBalance1/EE123
    @GetMapping("getBalance1/{accountNr}")
    public String getBalance1(@PathVariable("accountNr") String accountNr) {
        return "Konto balanss on: " + accountBalanceMap.get(accountNr);

    }
}
