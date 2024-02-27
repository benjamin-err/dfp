package at.jku.dfp.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class OptionalPID {
    String familyNameAtBirth;
    String firstNameAtBirth;
    String placeOfBirth;
    String currentAddress;
    String gender;
}
