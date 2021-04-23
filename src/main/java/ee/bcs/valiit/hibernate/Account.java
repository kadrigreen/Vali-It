package ee.bcs.valiit.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="accounts")
@Entity
public class Account {
    // @Id
//@GeneratedValue (strategy=GenerationType.IDENTITY) kasutame siis kui meil on mingi id tulp või auto incremented tulp
    @Id private String accountNumber;
    private Double balance;
    private String name;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
