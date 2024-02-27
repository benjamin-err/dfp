package at.jku.dfp.dtos;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * DTO for {@link at.jku.dfp.entities.PID}
 */
public class PIDDto implements Serializable {
    private final Long id;
    private final String firstName;
    private final String familyName;
    private final Instant dateOfBirth;

    public PIDDto(Long id, String firstName, String familyName, Instant dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.familyName = familyName;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PIDDto entity = (PIDDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.firstName, entity.firstName) &&
                Objects.equals(this.familyName, entity.familyName) &&
                Objects.equals(this.dateOfBirth, entity.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, familyName, dateOfBirth);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "firstName = " + firstName + ", " +
                "familyName = " + familyName + ", " +
                "dateOfBirth = " + dateOfBirth + ")";
    }
}