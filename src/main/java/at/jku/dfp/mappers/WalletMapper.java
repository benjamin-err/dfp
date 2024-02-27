package at.jku.dfp.mappers;

import at.jku.dfp.dtos.WalletDto;
import at.jku.dfp.entities.Wallet;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface WalletMapper {
    Wallet toEntity(WalletDto walletDto);

    @AfterMapping
    default void linkCredentials(@MappingTarget Wallet wallet) {
        wallet.getCredentials().forEach(credential -> credential.setWallet(wallet));
    }

    WalletDto toDto(Wallet wallet);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Wallet partialUpdate(WalletDto walletDto, @MappingTarget Wallet wallet);
}