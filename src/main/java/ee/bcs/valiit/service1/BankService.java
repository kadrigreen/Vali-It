package ee.bcs.valiit.service1;

import ee.bcs.valiit.hibernate.Account;
import ee.bcs.valiit.hibernate.AccountRepository;
import ee.bcs.valiit.repository1.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;
    @Autowired
    private AccountRepository hibernateAccountRepository;

    public void createAccount(String accountNr, Double balance, String name) {
        /*if(balance < 0){
            throw new SampleApplicationException("Negative amount");
        }*/
        bankRepository.createAccount(accountNr, balance, name);
    }

    public String getBalance(String accountNr) {
        Account account= hibernateAccountRepository.getOne(accountNr);
     // return "Your balance is: " + bankRepository.getBalance(accountNr); SQLi näide
       return "Your balance is: " + account.getBalance();

    }

    public String depositMoney(String accountNr, Double amount) {
        if (amount > 0) {
            double balance = bankRepository.getBalance(accountNr);
            balance += amount;
            bankRepository.updateBalance(accountNr, balance);
            return amount + " added to account " + accountNr + " new balance is: " + balance;
        } else {
            return "Invalid amount";
        }
    }

    public String withdrawMoney(String accountNr, Double amount) {
        if (amount > 0) {
            if (bankRepository.getBalance(accountNr) < 0) {
                return "Not enough money";
            } else {
                double balance = bankRepository.getBalance(accountNr) - amount;
                bankRepository.updateBalance(accountNr, balance);
                return amount + " withdrawn from account " + accountNr + " new balance is: " + balance;
            }
        } else {
            return "Invalid amount";
        }
    }

    public String transferMoney(String fromAccount, String toAccount, Double amount) {
        if (amount > 0) {
            if (bankRepository.getBalance(fromAccount) - amount < 0) {
                return "Not enough money";
            }
            double balance1 = bankRepository.getBalance(fromAccount) - amount;
            double balance2 = bankRepository.getBalance(toAccount) + amount;
            bankRepository.updateBalance(fromAccount, balance1);
            bankRepository.updateBalance(toAccount, balance2);
            return amount + " transferred from account " + fromAccount + " to account " + toAccount +
                    ". New balance1 is: " + balance1 + " . New balance2 is: " + balance2;
        } else {
            return "Invalid amount";
        }
    }

    /*public List<> transactionHistory (String accountNr){
        return  accountNr+" transaction history: ";
    }*/
}
