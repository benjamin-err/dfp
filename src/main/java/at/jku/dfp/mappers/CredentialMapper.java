package at.jku.dfp.mappers;

import at.jku.dfp.dtos.CredentialDto;
import at.jku.dfp.entities.Credential;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CredentialMapper {
    Credential toEntity(CredentialDto credentialDto);

    CredentialDto toDto(Credential credential);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Credential partialUpdate(CredentialDto credentialDto, @MappingTarget Credential credential);

}