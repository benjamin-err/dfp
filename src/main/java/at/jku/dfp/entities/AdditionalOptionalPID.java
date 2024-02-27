package at.jku.dfp.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class AdditionalOptionalPID {
    String nationality;
    Long ssn;
}
