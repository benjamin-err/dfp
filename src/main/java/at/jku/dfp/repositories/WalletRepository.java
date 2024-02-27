package at.jku.dfp.repositories;

import at.jku.dfp.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    @Override
    Optional<Wallet> findById(Long aLong);
}