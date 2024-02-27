package at.jku.dfp.entities;

import jakarta.persistence.*;

import java.time.Instant;


@Entity(name = "at.jku.dfp.entities.PID")
@Table(name = "pid")
//@SequenceGenerator(name = "PID_Seq", sequenceName = "at.jku.dfp.PID_Seq", allocationSize = 5)
public class PID {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
            //strategy = GenerationType.SEQUENCE,
            //generator = "PID_Seq"
    )
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "family_name", nullable = false)
    private String familyName;

    @Column(name = "date_of_birth", nullable = false)
    private Instant dateOfBirth;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="familyNameAtBirth",
                    column=@Column(name="family_name_at_birth")),
            @AttributeOverride(name="firstNameAtBirth",
                    column=@Column(name="first_name_at_birth")),
            @AttributeOverride(name="placeOfBirth",
                    column=@Column(name="place_of_birth")),
            @AttributeOverride(name="currentAddress",
                    column=@Column(name="current_address"))
    })
    private OptionalPID optionalPID;

    @Embedded
    private AdditionalOptionalPID additionalOptionalPID;

    public PID() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public OptionalPID getOptionalPID() {
        return optionalPID;
    }

    public void setOptionalPID(OptionalPID optionalPID) {
        this.optionalPID = optionalPID;
    }

    public AdditionalOptionalPID getAdditionalOptionalPID() {
        return additionalOptionalPID;
    }

    public void setAdditionalOptionalPID(AdditionalOptionalPID additionalOptionalPID) {
        this.additionalOptionalPID = additionalOptionalPID;
    }
}
