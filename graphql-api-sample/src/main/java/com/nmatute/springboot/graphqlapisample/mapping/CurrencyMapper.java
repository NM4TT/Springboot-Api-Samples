package com.nmatute.springboot.graphqlapisample.mapping;

import org.mapstruct.Mapper;

import com.nmatute.springboot.graphqlapisample.domain.dto.CountryDTO.CurrencyDTO;
import com.nmatute.springboot.graphqlapisample.persistence.entity.Country.Currency;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;

@Mapper(componentModel = "spring")
public interface CurrencyMapper {
    
    CurrencyDTO toDTO(Currency entity);

    @InheritInverseConfiguration
    Currency toEntity(CurrencyDTO dto);

    List<CurrencyDTO> toDTOs(List<Currency> entities);

    @InheritInverseConfiguration
    List<Currency> toEntities(List<CurrencyDTO> dtos);

}