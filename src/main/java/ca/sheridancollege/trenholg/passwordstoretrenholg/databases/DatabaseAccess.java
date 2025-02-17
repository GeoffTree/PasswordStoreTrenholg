package ca.sheridancollege.trenholg.passwordstoretrenholg.databases;

import ca.sheridancollege.trenholg.passwordstoretrenholg.beans.PasswordRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatabaseAccess extends CrudRepository<PasswordRecord, Long> {
    List<PasswordRecord> findByTitleContainingIgnoreCase(String title);
}
