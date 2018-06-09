package pl.sdacademy.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sdacademy.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
