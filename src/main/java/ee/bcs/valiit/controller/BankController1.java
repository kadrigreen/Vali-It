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
    public static String getBalance1(@PathVariable("accountNr") String accountNr) {
        return "Your balance is: " + accountBalanceMap.get(accountNr).getBalance();

    }

    //    http://localhost:8081/depositMoney1/EE123/120
    @GetMapping("depositMoney1/{accountNr}/{amount}")
    public String depositMoney1(@PathVariable("accountNr") String accountNr,
                                @PathVariable("amount") double amount) {
        if (amount > 0) {
            double balance = accountBalanceMap.get(accountNr).getBalance();
            balance += amount;
            accountBalanceMap.get(accountNr).setBalance(balance);
            return amount + " added to account " + accountNr + " new balance is: " + balance;
        } else {
            return "Invalid amount";
        }
    }

    //    http://localhost:8081/withdrawMoney1/EE123/10
    @GetMapping("withdrawMoney1/{accountNr}/{amount}")
    public String withdrawMoney1(@PathVariable("accountNr") String accountNr,
                                 @PathVariable("amount") double amount) {
        if (amount > 0) {
            double balance = accountBalanceMap.get(accountNr).getBalance();
            if (balance < 0) {
                return "Not enough money";
            } else {
                balance -= amount;
                accountBalanceMap.get(accountNr).setBalance(balance);
                return amount + " withdrawn from account " + accountNr + " new balance is: " + balance;
            }
        } else {
            return "Invalid amount";
        }
    }

    //  transfer money
//    http://localhost:8081/transferMoney1/EE123/EE321/100
    @GetMapping("transferMoney1/{fromAccount}/{toAccount}/{amount}")
    public String transferMoney1(@PathVariable("fromAccount") String fromAccount,
                                 @PathVariable("toAccount") String toAccount,
                                 @PathVariable("amount") double amount) {
        double balance1 = accountBalanceMap.get(fromAccount).getBalance();
        double balance2 = accountBalanceMap.get(toAccount).getBalance();
        if (amount > 0) {
            if (balance1 - amount < 0) {
                return "Not enough money";
            }
            balance1 -= amount;
            balance2 += amount;
            accountBalanceMap.get(fromAccount).setBalance(balance1);
            accountBalanceMap.get(toAccount).setBalance(balance2);
            return amount + " transferred from account " + fromAccount + " to account " + toAccount +
                    ". New balance1 is: " + balance1 + " . New balance2 is: " + balance2;
        } else {
            return "Invalid amount";
        }
    }

    //  Lock account
//    http://localhost:8081/accountLocked/EE123/accountLocked
   /* @GetMapping("accountLocked/{accountNr}/{lock}")
    public String accountLocked(@PathVariable("accountNr") String accountNr,
                                @PathVariable("accountLocked") boolean accountLocked) {
    }*/

    //  Unlock account
//    http://localhost:8081/accountUnLocked/EE123/accountUnLocked

}
