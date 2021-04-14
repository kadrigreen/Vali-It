package ee.bcs.valiit.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson4 {
    // Store account nr as a key and account balance as value
    // HashMap<String, Account> accountBalanceMap = new HashMap<>();
    private static Map<String, Double> accountBalanceMap = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose action: \n" +
                    "1. Create Account " + " 2. Get Balance \n" +
                    // 1 all the time 2 only with account
                    "3. Deposit Money " + " 4. Withdraw Money \n" +
                    //only with an account
                    "5. Transfer Money " + " 6. Exit \n");
            // only with an account + balance

            //String line = scanner.nextLine();
            //if (line.equalsIgnoreCase("exit")) {
            // break;
            //}

            int function = scanner.nextInt();
            if (function == 1) {
                System.out.println("Create account. Insert account number.");
                String accountNr = scanner.next();
                accountBalanceMap.put(accountNr, 0.0);
                System.out.println("Your account number is " + accountNr);
                System.out.println(" ");  // tühi rida enne uue funktsiooni valikut


            } else if (function == 2) {
                System.out.println("Get Balance. Insert account number.");
                String accountNr = scanner.next();
                accountBalanceMap.get(accountNr);
                if (accountBalanceMap.get(accountNr) < 0) {
                    System.out.println("Balance is 0.");
                } else {
                    System.out.println("Balance is " + accountBalanceMap.get(accountNr));
                }
                System.out.println(" ");  // tühi rida enne uue funktsiooni valikut
            } else if (function == 3) {
                System.out.println("Deposit money. Insert account number.");
                String accountNr = scanner.next();
                System.out.println("Insert amount.");
                double amount = scanner.nextDouble();
                if (amount < 0) {
                    System.out.println("Insert positive value only!");
                } else {                    //kõigi muude variantide korral käivitub see
                    double balance = accountBalanceMap.get(accountNr) + amount;
                    //et näidata, kuhu raha panna, millise konto juurde, lisab kontojäägile
                    accountBalanceMap.put(accountNr, balance); // Miks ei näita kontojääki??put ja replace vahe?
                    System.out.println(amount + " added to account " + accountNr + ". New balance is: " + balance);
                }
            } else if (function == 4) {
                System.out.println("Withdraw money. Insert account number.");
                String accountNr = scanner.next();
                System.out.println("Insert amount.");
                double amount = scanner.nextDouble();
                if (amount < 0) {
                    System.out.println("Insert positive value only!");
                } else if (accountBalanceMap.get(accountNr) - amount < 0) {
                    System.out.println("Transaction not allowed. Not enough money on account." +
                            "Your balance is " + accountBalanceMap.get(accountNr));
                } else {     //(withdraw>=0){
                    double balance = accountBalanceMap.get(accountNr) - amount;
                    //kontojääk
                    accountBalanceMap.put(accountNr, balance); //Miks ei näita kontojääki?
                    System.out.println(amount + " was withdrawn from account " + accountNr + "" + ". New Balance is: " + balance);
                }
                System.out.println(" ");  // tühi rida enne uue funktsiooni valikut
            } else if (function == 5) {
                System.out.println("Transfer money." +
                        "Insert amount.");
                double amount = scanner.nextDouble();
                if (amount < 0) {
                    System.out.println("Insert positive value only!");
                } else {     //if (amount>=0){
                    System.out.println("From account: insert account number");
                    String fromAccount = scanner.next();
                    if (accountBalanceMap.get(fromAccount) - amount < 0) {
                        System.out.println("Transaction not allowed. Not enough money on account." +
                                "Your balance is " + accountBalanceMap.get(fromAccount));
                    } else { //if (accountBalanceMap.get(fromAccount) - amount >=0) {
                        System.out.println("To account: insert account number");
                        String toAccount = scanner.next();
                        //store a new account number with 0 balance ????
                        accountBalanceMap.put(toAccount, 0.0);
                        double balance = accountBalanceMap.get(fromAccount) - amount;
                        double balance2 = accountBalanceMap.get(toAccount) + amount;
                        //kontojääk
                        accountBalanceMap.put(fromAccount, balance);
                        System.out.println(amount + " was transfered from account " + fromAccount + " to account " + toAccount +
                                ". New balance on account " + fromAccount + " is " + balance);
                        System.out.println("New balance on account " + toAccount + " is " + balance2);
                    }
                }
                System.out.println(" ");  // tühi rida enne uue funktsiooni valikut
            } else if (function == 6) {
                System.out.println("Exit");
                break;
            }


            // TODO 1
            // Add command: "createAccount ${accountNr}"
            // this has to store accountNr with 0 balance
            // TODO 2
            // Add command: "getBalance ${accountNr}"
            // this has to display account balance of specific account
            // TODO 3
            // Add command: "depositMoney ${accountNr} ${amount}
            // this has to add specified amount of money to account
            // You have to check that amount is positive number
            // TODO 4
            // Add command: "withdrawMoney ${accountNr} ${amount}
            // This has to remove specified amount of money from account
            // You have to check that amount is positive number
            // You may not allow this transaction if account balance would become negative
            // TODO 5
            // Add command: "transfer ${fromAccount} ${toAccount} ${amount}
            // This has to remove specified amount from fromAccount and add it to toAccount
            // Your application needs to check that toAccount is positive
            // And from account has enough money to do that transaction
            else {
                System.out.println("Unknown command");
            }
        }
    }


}
