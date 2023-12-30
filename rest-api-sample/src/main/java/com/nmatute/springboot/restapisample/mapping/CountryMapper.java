package com.nmatute.springboot.restapisample.mapping;

import org.mapstruct.Mapper;

import com.nmatute.springboot.restapisample.domain.dto.CountryDTO;
import com.nmatute.springboot.restapisample.persistence.entity.Country;

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