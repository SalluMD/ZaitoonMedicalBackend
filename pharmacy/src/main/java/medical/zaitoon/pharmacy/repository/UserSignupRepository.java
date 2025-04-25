package medical.zaitoon.pharmacy.repository;

import medical.zaitoon.pharmacy.model.UsersData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSignupRepository extends JpaRepository<UsersData, String> {
}
