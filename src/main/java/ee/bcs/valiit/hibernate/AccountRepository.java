package ee.bcs.valiit.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, String> {
    Account getByName(String name);
    List<Account> findAllByAccountNumberContaining(String accountNumber);
}
