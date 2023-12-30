package com.nmatute.springboot.graphqlapisample.mapping;

import org.mapstruct.Mapper;

import com.nmatute.springboot.graphqlapisample.domain.dto.CountryDTO;
import com.nmatute.springboot.graphqlapisample.persistence.entity.Country;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;

@Mapper(componentModel = "spring", uses = {CurrencyMapper.class})
public interface CountryMapper {
    
    CountryDTO toDTO(Country entity);

    @InheritInverseConfiguration
    Country toEntity(CountryDTO dto);

    List<CountryDTO> toDTOs(List<Country> entities);

    @InheritInverseConfiguration
    List<Country> toEntities(List<CountryDTO> dtos);

}