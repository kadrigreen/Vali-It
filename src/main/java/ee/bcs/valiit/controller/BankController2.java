package ee.bcs.valiit.controller;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController2 {

    // SQLiga sidumine enne service'i ja repository'ga sidumist.


    /*@Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    private BankService bankService;

    private static Map<String, BankAccountInfo> accountBalanceMap = new HashMap<>();

    // Create account
    //   http://localhost:8081/createAccount1/EE123/100/Mari
    @GetMapping("createAccount1/{accountNr}/{balance}/{name}")
    public void createAccount1(@PathVariable("accountNr") String accountNr,
                               @PathVariable("balance") double balance,
                               @PathVariable("name") String name) {
        *//*String sql = "insert into accounts(account_nr, balance, name) values(:dbAccountNr, :dbAmount, :dbName)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbAccountNr", accountNr);
        paramMap.put("dbAmount", balance);
        paramMap.put("dbName", name);
        jdbcTemplate.update(sql, paramMap);*//*

//        BankAccountInfo account = new BankAccountInfo();
//        account.setOwnerName(ownerName);
//        account.setAccountNr(accountNr);
//        account.setBalance(balance);
//        accountBalanceMap.put(accountNr, account);
    }

    // Get balance
    //   http://localhost:8081/getBalance1/EE1111
    @GetMapping("getBalance1/{accountNr}")
    public String getBalance1(@PathVariable("accountNr") String accountNr) {
       *//* String sql = "SELECT balance FROM accounts WHERE account_nr = :dbAccountNr";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbAccountNr", accountNr);
        double balance = jdbcTemplate.queryForObject(sql, paramMap, double.class);
        return "Your balance is: " + balance;*//*

    }

    //    http://localhost:8081/depositMoney1/EE1111/120
    @GetMapping("depositMoney1/{accountNr}/{amount}")
    public String depositMoney1(@PathVariable("accountNr") String accountNr,
                                @PathVariable("amount") double amount) {
        if (amount > 0) {
            String sql1 = "SELECT balance FROM accounts WHERE account_nr = :dbAccountNr";
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("dbAccountNr", accountNr);
            double balance = jdbcTemplate.queryForObject(sql1, paramMap, double.class);
            balance += amount;
            String add = "UPDATE accounts SET balance = :dbBalance WHERE account_nr = :dbAccountNr ";
            paramMap.put("dbBalance", balance);
            jdbcTemplate.update(add, paramMap);
            return amount + " added to account " + accountNr + " new balance is: " + balance;
        } else {
            return "Invalid amount";
        }
    }

    //    http://localhost:8081/withdrawMoney1/EE1111/10
    @GetMapping("withdrawMoney1/{accountNr}/{amount}")
    public String withdrawMoney1(@PathVariable("accountNr") String accountNr,
                                 @PathVariable("amount") double amount) {
        if (amount > 0) {
            String sql = "select balance from accounts where account_nr = :dbAccountNr";
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("dbAccountNr", accountNr);
            double balance = jdbcTemplate.queryForObject(sql, paramMap, double.class);
            if (balance < 0) {
                return "Not enough money";
            } else {
                balance -= amount;
                String withdraw = "UPDATE accounts SET balance = :dbBalance WHERE account_nr = :dbAccountNr ";
                paramMap.put("dbBalance", balance);
                jdbcTemplate.update(withdraw, paramMap);
                return amount + " withdrawn from account " + accountNr + " new balance is: " + balance;
            }
        } else {
            return "Invalid amount";
        }
    }

    //  transfer money
//    http://localhost:8081/transferMoney1/EE1111/EE3333/111
    @GetMapping("transferMoney1/{fromAccount}/{toAccount}/{amount}")
    public String transferMoney1(@PathVariable("fromAccount") String fromAccount,
                                 @PathVariable("toAccount") String toAccount,
                                 @PathVariable("amount") double amount) {
        String sql1 = "select balance from accounts where account_nr= :dbAccountNr1";
        String sql2 = "select balance from accounts where account_nr= :dbAccountNr2";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("dbAccountNr1", fromAccount);
        paramMap.put("dbAccountNr2", toAccount);
        double balance1 = jdbcTemplate.queryForObject(sql1, paramMap, double.class);
        double balance2 = jdbcTemplate.queryForObject(sql2, paramMap, double.class);
        if (amount > 0) {
            if (balance1 - amount < 0) {
                return "Not enough money";
            }
            balance1 -= amount;
            balance2 += amount;
            String withdraw = "UPDATE accounts SET balance = :dbBalance1 WHERE account_nr = :dbAccountNr1 ";
            String add = "UPDATE accounts SET balance = :dbBalance2 WHERE account_nr = :dbAccountNr2 ";
            paramMap.put("dbBalance1", balance1);
            paramMap.put("dbBalance2", balance2);
            jdbcTemplate.update(withdraw, paramMap);
            jdbcTemplate.update(add, paramMap);

            return amount + " transferred from account " + fromAccount + " to account " + toAccount +
                    ". New balance1 is: " + balance1 + " . New balance2 is: " + balance2;
        } else {
            return "Invalid amount";
        }
    }

    //  Lock account
//    http://localhost:8081/accountLocked/EE123/accountLocked
    //   @GetMapping("accountLocked/{accountNr}")
    //   public String accountLocked(@PathVariable("accountNr") String accountNr) {

    //       accountBalanceMap.get(accountNr).setAccountLocked(true);
    //      return null;
    //  }


    //  Unlock account
//    http://localhost:8081/accountUnLocked/EE123/accountUnLocked
    //    @GetMapping("accountUnLocked/{accountNr}")
    //   public String accountUnLocked(@PathVariable("accountNr") String accountNr) {
    //      accountBalanceMap.get(accountNr).setAccountLocked(false);
    //     return null;
    //   }
    */
}
