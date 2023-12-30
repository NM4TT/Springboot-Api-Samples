package com.nmatute.springboot.soapapisample.domain.service;

import org.springframework.stereotype.Service;

import com.nmatute.springboot.soapapisample.generated.country.Country;
import com.nmatute.springboot.soapapisample.persistence.repository.CountryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CountryService {
    
    private final CountryRepository countryRepository;

    public Country findCountry(String name) {
        return countryRepository.getCountries().get(name);
    }

}
