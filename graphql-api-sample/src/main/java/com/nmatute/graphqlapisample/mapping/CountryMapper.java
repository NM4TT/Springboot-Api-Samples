package com.nmatute.graphqlapisample.mapping;

import org.mapstruct.Mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;

import com.nmatute.graphqlapisample.domain.dto.CountryDTO;
import com.nmatute.graphqlapisample.persistence.entity.Country;

@Mapper(componentModel = "spring", uses = {CurrencyMapper.class})
public interface CountryMapper {
    
    CountryDTO toDTO(Country entity);

    @InheritInverseConfiguration
    Country toEntity(CountryDTO dto);

    List<CountryDTO> toDTOs(List<Country> entities);

    @InheritInverseConfiguration
    List<Country> toEntities(List<CountryDTO> dtos);

}