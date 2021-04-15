package ee.bcs.valiit.codewars;

import java.util.HashMap;
import java.util.Map;

public class Lesson4versioon2 {

    private String accountNumber;
    private Double amount;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }








    private static Map<String, Double> accountBalanceMap = new HashMap<>();


    public static void main(String[] args) {
        System.out.println(createAccount("123"));
        System.out.println(getBalance("123"));
        System.out.println(depositMoney("123", 12));
        System.out.println(transferMoney("123", "321", 6.5));
    }

    public static String createAccount(String accountNr) {
        accountBalanceMap.put(accountNr, 0.0);
        return accountNr;
    }

    public static double getBalance(String accountNr) {
        return accountBalanceMap.get(accountNr);
    }

    public static double depositMoney(String accountNr, double depositAmount) {
        if (depositAmount < 0) {
            return 0;

        } else {
            double balance = accountBalanceMap.get(accountNr) + depositAmount;
            return balance;
        }
    }

    public static double withdrawMoney(String accountNr, double withdrawAmount) {
        double balance = 0;
        if (accountBalanceMap.get(accountNr) <= 0) {
            return 0;
        } else if (withdrawAmount <= 0) {
            return 0;
        } else if (accountBalanceMap.get(accountNr) - withdrawAmount < 0) {
            return 0;
        } else {     //(withdraw>=0){
            balance = accountBalanceMap.get(accountNr) - withdrawAmount;
            //kontojääk
            return accountBalanceMap.put(accountNr, balance);
        }
    }

    public static double transferMoney(String fromAccount, String toAccount, double transferAmount) {
        if (transferAmount <= 0) {
            return 0;
        } else if (accountBalanceMap.get(fromAccount) - transferAmount <= 0) {
            return 0;
        } else {
        // accountBalanceMap.put(toAccount, 0.0);
        double balance = accountBalanceMap.get(fromAccount) - transferAmount;
        double balance2 = accountBalanceMap.get(toAccount) + transferAmount;
        accountBalanceMap.put(fromAccount, balance);
        accountBalanceMap.put(toAccount, balance2);
        return balance;
    }
}
    }





