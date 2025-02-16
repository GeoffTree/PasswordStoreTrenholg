package ca.sheridancollege.trenholg.passwordstoretrenholg.databases;

import ca.sheridancollege.trenholg.passwordstoretrenholg.beans.PasswordRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseAccess extends CrudRepository<PasswordRecord, Long> {
}
