package com.nmatute.graphqlapisample.web.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.nmatute.graphqlapisample.domain.dto.CountryDTO;
import com.nmatute.graphqlapisample.domain.dto.CountryDTO.CurrencyDTO;
import com.nmatute.graphqlapisample.domain.service.CountryService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ApiController {
    
    private final CountryService countryService;

    @QueryMapping
    public Iterable<CountryDTO> countries() {
        return countryService.getAll();
    }

    @QueryMapping
    public CountryDTO countryByName(@Argument String name) {
        return countryService.getByName(name);
    }

    @SchemaMapping
    public CurrencyDTO currency(CountryDTO country) {
        return country.getCurrency();
    }

}
