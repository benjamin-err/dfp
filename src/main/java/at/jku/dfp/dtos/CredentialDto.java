package at.jku.dfp.dtos;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link at.jku.dfp.entities.Credential}
 */
public class CredentialDto implements Serializable {
    private final Long id;
    private final String credentialFile;

    public CredentialDto(Long id, String credentialFile) {
        this.id = id;
        this.credentialFile = credentialFile;
    }

    public Long getId() {
        return id;
    }

    public String getCredentialFile() {
        return credentialFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CredentialDto entity = (CredentialDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.credentialFile, entity.credentialFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, credentialFile);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "credentialFile = " + credentialFile + ")";
    }
}