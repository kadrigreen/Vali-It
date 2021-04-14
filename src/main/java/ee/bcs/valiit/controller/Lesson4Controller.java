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
    //   http://localhost:8080/createAccount/EE123
    @GetMapping("createAccount/{accountNr}")
    public static String createAccount(@PathVariable("accountNr") String accountNr) {
        accountBalanceMap.put(accountNr, 0.0);
        return accountNr;
    }

    // Get balance
    //   http://localhost:8080/createAccount/EE123  // kuidas ma saan balance'i?
    @GetMapping("getBalance/{accountNr}")
    public static String getBalance(@PathVariable("accountNr") String accountNr) {
        accountBalanceMap.get(accountNr);
        return accountNr;
    }

}
