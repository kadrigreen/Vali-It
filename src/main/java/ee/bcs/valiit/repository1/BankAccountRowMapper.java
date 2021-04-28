package ee.bcs.valiit.repository1;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BankAccountRowMapper implements RowMapper<Transaction> {

    @Override
    public Transaction mapRow(ResultSet resultSet, int i) throws SQLException{
    Transaction response = new Transaction();
    response.getAccountNumber(resultSet.getString("account_number"));
    response.setBalance(resultSet.getDouble("balance"));
    response.setName(resultSet.getString("name"));
    return response;
    }
}





