package ee.bcs.valiit.repository1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BankRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void createAccount(String accountNr, Double balance, String name) {
        String sql = "insert into accounts(account_nr, balance, name) values(:dbAccountNr, :dbAmount, :dbName)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbAccountNr", accountNr);
        paramMap.put("dbAmount", balance);
        paramMap.put("dbName", name);
        jdbcTemplate.update(sql, paramMap);
    }

    public Double getBalance (String accountNr){

        String sql = "SELECT balance FROM accounts WHERE account_nr = :dbAccountNr";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbAccountNr", accountNr);
        double balance = jdbcTemplate.queryForObject(sql, paramMap, double.class);
        return balance;
    }

    public void updateBalance(String accountNr, Double amount){ // updateBalance
        String addToSql = "UPDATE accounts SET balance = :dbBalance WHERE account_nr = :dbAccountNr ";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbBalance",amount); // amount+balance asendab vana balance'i???
        paramMap.put("dbAccountNr", accountNr);
        jdbcTemplate.update(addToSql, paramMap);
    }

}
