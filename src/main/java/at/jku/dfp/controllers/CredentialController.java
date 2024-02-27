package at.jku.dfp.controllers;

import at.jku.dfp.dtos.CredentialDto;
import at.jku.dfp.entities.Credential;
import at.jku.dfp.mappers.CredentialMapper;
import at.jku.dfp.repositories.CredentialRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/dfp/credential")
public class CredentialController {

    private final CredentialRepository credentialRepository;
    private final CredentialMapper credentialMapper;

    public CredentialController(CredentialRepository credentialRepository,
                                CredentialMapper credentialMapper) {
        this.credentialRepository = credentialRepository;
        this.credentialMapper = credentialMapper;
    }


    @GetMapping("/find/{id}")
    public ResponseEntity<CredentialDto> findById(@PathVariable Long id) {

        Optional<Credential> optionalCredential = credentialRepository
                .findById(id);

        Optional<CredentialDto> credentialDto = optionalCredential
                .map(credentialMapper::toDto);

        return credentialDto
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
