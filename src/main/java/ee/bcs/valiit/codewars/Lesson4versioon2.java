package ee.bcs.valiit.codewars;

import java.util.HashMap;
import java.util.Map;

public class Lesson4versioon2 {

    private static Map<String, Double> accountBalanceMap = new HashMap<>();

    public static void main(String[] args) {

    }

    public static String createAccount(String accountNr) {
        accountBalanceMap.put(accountNr, 0.0);
        return accountNr;
    }

    public static String getBalance(String accountNr) {
        accountBalanceMap.get(accountNr);
            return accountNr;
        }


    }


