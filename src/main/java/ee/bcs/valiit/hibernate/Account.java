package ee.bcs.valiit.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="accounts")
@Entity
public class Account {
    @Id
    private String accountNr;
    private Double balance;
    private String name;

    public String getAccountNr(){
        return accountNr;
    }
}
