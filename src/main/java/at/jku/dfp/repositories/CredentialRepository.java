package at.jku.dfp.repositories;

import at.jku.dfp.entities.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CredentialRepository extends JpaRepository<Credential, Long> {
    @Override
    Optional<Credential> findById(Long aLong);
}