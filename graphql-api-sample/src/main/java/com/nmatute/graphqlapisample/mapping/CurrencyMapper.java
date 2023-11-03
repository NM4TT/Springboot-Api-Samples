package com.nmatute.graphqlapisample.mapping;

import org.mapstruct.Mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;

import com.nmatute.graphqlapisample.domain.dto.CountryDTO.CurrencyDTO;
import com.nmatute.graphqlapisample.persistence.entity.Country.Currency;

@Mapper(componentModel = "spring")
public interface CurrencyMapper {
    
    CurrencyDTO toDTO(Currency entity);

    @InheritInverseConfiguration
    Currency toEntity(CurrencyDTO dto);

    List<CurrencyDTO> toDTOs(List<Currency> entities);

    @InheritInverseConfiguration
    List<Currency> toEntities(List<CurrencyDTO> dtos);

}