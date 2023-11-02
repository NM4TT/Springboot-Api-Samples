package com.nmatute.restapisample.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.InheritInverseConfiguration;

import com.nmatute.restapisample.domain.dto.CountryDTO;
import com.nmatute.restapisample.persistence.entity.Country;

@Mapper(componentModel = "spring", uses = {CurrencyMapper.class})
public interface CountryMapper {
    
    CountryDTO toDTO(Country entity);

    @InheritInverseConfiguration
    Country toEntity(CountryDTO dto);

    List<CountryDTO> toDTOs(List<Country> entities);

    @InheritInverseConfiguration
    List<Country> toEntities(List<CountryDTO> dtos);

}