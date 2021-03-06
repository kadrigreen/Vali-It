package ee.bcs.valiit.controller;

import ee.bcs.valiit.service1.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BankController1 {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    private BankService bankService;

    private static Map<String, BankAccountInfo> accountBalanceMap = new HashMap<>();

    // Create account
    //   http://localhost:8081/createAccount1/EE123/100/Mari
    @CrossOrigin
    @GetMapping("createAccount1/{accountNr}/{balance}/{name}")
    public void createAccount1(@PathVariable("accountNr") String accountNr,
                               @PathVariable("balance") double balance,
                               @PathVariable("name") String name) {

        bankService.createAccount(accountNr, balance, name);
    }

    // Get balance
    //   http://localhost:8081/getBalance1/EE1111
    @CrossOrigin
    @GetMapping("getBalance1/{accountNr}")
    public Double getBalance1(@PathVariable("accountNr") String accountNr) {

        return bankService.getBalance(accountNr);

    }

    //    http://localhost:8081/depositMoney1/EE1111/120
    @CrossOrigin
    @GetMapping("depositMoney1/{accountNr}/{amount}")
    public Double depositMoney1(@PathVariable("accountNr") String accountNr,
                                @PathVariable("amount") double amount) {

        return bankService.depositMoney(accountNr,amount);

    }

    //    http://localhost:8081/withdrawMoney1/EE1111/10
    @CrossOrigin
    @GetMapping("withdrawMoney1/{accountNr}/{amount}")
    public String withdrawMoney1(@PathVariable("accountNr") String accountNr,
                                 @PathVariable("amount") double amount) {
        return bankService.withdrawMoney(accountNr, amount);
    }

    //  transfer money
//    http://localhost:8081/transferMoney1/EE1111/EE3333/111
    @CrossOrigin
    @GetMapping("transferMoney1/{fromAccount}/{toAccount}/{amount}")
    public String transferMoney1(@PathVariable("fromAccount") String fromAccount,
                                 @PathVariable("toAccount") String toAccount,
                                 @PathVariable("amount") double amount) {
        return bankService.transferMoney(fromAccount, toAccount, amount);
    }


    //    http://localhost:8081/getAllAccounts/
//    @CrossOrigin
//    @GetMapping ("getAllAccounts/")
//    public List<AllAccounts> getAllAccounts (){
//        return bankService.getAllAccounts();
//    }


    // transaction history
    // http://localhost:8081/transactionHistory/EE1111
   /* @GetMapping("transactionHistory/{accountNr}")
    public List<Transaction> transactionHistory(@PathVariable ("accountNr") String accountNr){
        return bankService.transactionHistory(accountNr);
    }*/
}
