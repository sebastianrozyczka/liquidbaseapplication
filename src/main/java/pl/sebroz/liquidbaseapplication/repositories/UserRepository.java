package pl.sebroz.liquidbaseapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sebroz.liquidbaseapplication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
