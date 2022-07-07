package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by jessat18 on 7/7/22.
 */

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
