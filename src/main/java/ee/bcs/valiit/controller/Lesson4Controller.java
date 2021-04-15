package ee.bcs.valiit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Lesson4Controller {

    private static Map<String, Double> accountBalanceMap = new HashMap<>();

    // Create account
    //   http://localhost:8081/createAccount/EE123/100
    @GetMapping("createAccount/{accountNr}/{balance}")
    public void createAccount(@PathVariable("accountNr") String accountNr, @PathVariable("balance") double balance) {
        accountBalanceMap.put(accountNr, balance);

    }

    // Get balance
    //   http://localhost:8081/getBalance/EE123
    @GetMapping("getBalance/{accountNr}")
    public String getBalance(@PathVariable("accountNr") String accountNr) {
        return "Konto balanss on: " + accountBalanceMap.get(accountNr);

    }

    //    http://localhost:8081/depositMoney/EE123/120
    @GetMapping("depositMoney/{accountNr}/{amount}")
    public String depositMoney(@PathVariable("accountNr") String accountNr, @PathVariable("amount") double amount) {
        if (amount > 0) {
            double balance = accountBalanceMap.get(accountNr);
            balance += amount;
            accountBalanceMap.put(accountNr, balance);
            return amount + " added to account " + accountNr + " new balance is: " + balance;
        } else {
            return "Invalid amount";
        }
    }
//    http://localhost:8081/withdrawMoney/EE123/10
    @GetMapping("withdrawMoney/{accountNr}/{amount}")
    public String withdrawMoney(@PathVariable("accountNr") String accountNr,
                                @PathVariable("amount") double amount) {
        if (amount > 0) {
            double balance = accountBalanceMap.get(accountNr);
            if (balance < 0) {
                return "Not enough money";
            } else {
                balance -= amount;
                accountBalanceMap.put(accountNr, balance);
                return amount + " withdrawn from account " + accountNr + " new balance is: " + balance;
            }
        } else {
            return "Invalid amount";
        }
    }

    //  transfer money
//    http://localhost:8081/transferMoney/EE123/EE321/100
    @GetMapping("transferMoney/{fromAccount}/{toAccount}/{amount}")
    public String transferMoney(@PathVariable("fromAccount") String fromAccount,
                                @PathVariable("toAccount") String toAccount,
                                @PathVariable("amount") double amount) {
        double balance1= accountBalanceMap.get(fromAccount);
        double balance2=accountBalanceMap.get(toAccount);
        if (amount>0){
            if(balance1-amount<0){
                return "Not enough money";
            }
            balance1-=amount;
            balance2+=amount;
            accountBalanceMap.put(fromAccount, balance1);
            accountBalanceMap.put(toAccount, balance2);
            return amount+ " transferred from account "+fromAccount+ " to account "+ toAccount+
                    ". New balance1 is: " +balance1+ " . New balance2 is: "+balance2;
        } else{
            return "Invalid amount";
        }
    }
}


