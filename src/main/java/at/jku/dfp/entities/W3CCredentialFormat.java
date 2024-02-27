package at.jku.dfp.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public abstract class W3CCredentialFormat {
    List<Context> contextList;
    String type;
    String issuer;

    private Instant validFrom;

    private CredentialSubject credentialSubject;

    @Getter
    @Setter
    @NoArgsConstructor
    class Context {
        String context;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    class CredentialSubject {
        String id;

        Claim claim;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    class Claim {
        String claim;
    }


}
