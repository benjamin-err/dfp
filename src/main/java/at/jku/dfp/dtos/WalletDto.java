package at.jku.dfp.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link at.jku.dfp.entities.Wallet}
 */
public class WalletDto implements Serializable {
    private final Long id;
    private final String walletHolder;
    private final List<CredentialDto> credentials;

    public WalletDto(Long id, String walletHolder, List<CredentialDto> credentials) {
        this.id = id;
        this.walletHolder = walletHolder;
        this.credentials = credentials;
    }

    public Long getId() {
        return id;
    }

    public String getWalletHolder() {
        return walletHolder;
    }

    public List<CredentialDto> getCredentials() {
        return credentials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WalletDto entity = (WalletDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.walletHolder, entity.walletHolder) &&
                Objects.equals(this.credentials, entity.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, walletHolder, credentials);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "walletHolder = " + walletHolder + ", " +
                "credentials = " + credentials + ")";
    }
}