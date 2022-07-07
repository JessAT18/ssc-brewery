package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jessat18 on 7/7/22.
 */

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
