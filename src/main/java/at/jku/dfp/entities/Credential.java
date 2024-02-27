package at.jku.dfp.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity(name = "at.jku.dfp.entities.Credential")
@Table(name = "credential")
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Lob
    @Column(name = "file", nullable = false, length=16384)
    private String credentialFile;

    @ManyToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;

    @Embedded
    Context context;

    String type;

    String issuer;
    private Instant validFrom;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="id",
                    column=@Column(name="claim_id")),
            @AttributeOverride(name="claim",
                    column=@Column(name="claim"))
    })
    private CredentialSubject credentialSubject;

    public Credential() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCredentialFile() {
        return credentialFile;
    }

    public void setCredentialFile(String credentialFile) {
        this.credentialFile = credentialFile;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Instant getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Instant validFrom) {
        this.validFrom = validFrom;
    }

    public CredentialSubject getCredentialSubject() {
        return credentialSubject;
    }

    public void setCredentialSubject(CredentialSubject credentialSubject) {
        this.credentialSubject = credentialSubject;
    }
}
