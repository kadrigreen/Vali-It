package ee.bcs.valiit.repository1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BankRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void createAccount(String accountNr, Double balance, String name) {
        String sql = "insert into accounts(account_number, balance, name) values(:dbAccountNr, :dbAmount, :dbName)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbAccountNr", accountNr);
        paramMap.put("dbAmount", balance);
        paramMap.put("dbName", name);
        jdbcTemplate.update(sql, paramMap);
    }

    public Double getBalance (String accountNr){

        String sql = "SELECT balance FROM accounts WHERE account_number = :dbAccountNr";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbAccountNr", accountNr);
        double balance = jdbcTemplate.queryForObject(sql, paramMap, double.class);
        return balance;
    }

    public void updateBalance(String accountNr, Double amount){ // updateBalance
        String addToSql = "UPDATE accounts SET balance = :dbBalance WHERE account_number = :dbAccountNr ";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbBalance",amount); // amount+balance asendab vana balance
        paramMap.put("dbAccountNr", accountNr);
        jdbcTemplate.update(addToSql, paramMap);
    }

/*
    public List<> transactionHistory( String accountNr){
        String sql = " select * from accounts where account_number = :dbAccountNr";
        Map<String, Object>paramMap = new HashMap<>();
        paramMap.put("dbAccountNr", accountNr);
        List<Transaction> transactionList= jdbcTemplate.queryForObject(sql, paramMap, new BankAccountRowMapper());
    }*/

    public List getAllAccounts (){
        String sql = "select * from accounts";
           return jdbcTemplate.query(sql, new HashMap(), new BankAccountRowMapper());
    }

}
