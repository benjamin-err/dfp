package at.jku.dfp.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "at.jku.dfp.entities.Wallet")
@Table(name = "wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, unique = true)
    private PID walletHolderId;

    @OneToMany(
            mappedBy = "wallet",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Credential> credentials;

    public Wallet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PID getWalletHolderId() {
        return walletHolderId;
    }

    public void setWalletHolderId(PID walletHolderId) {
        this.walletHolderId = walletHolderId;
    }

    public List<Credential> getCredentials() {
        return credentials;
    }

    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }
}