package at.jku.dfp.mappers;

import at.jku.dfp.dtos.PIDDto;
import at.jku.dfp.entities.PID;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PIDMapper {
    PID toEntity(PIDDto PIDDto);

    PIDDto toDto(PID PID);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PID partialUpdate(PIDDto PIDDto, @MappingTarget PID PID);
}