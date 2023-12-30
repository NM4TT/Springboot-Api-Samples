package com.nmatute.springboot.restapisample.domain.service;

import org.springframework.stereotype.Service;

import com.nmatute.springboot.restapisample.domain.dto.CountryDTO;
import com.nmatute.springboot.restapisample.mapping.CountryMapper;
import com.nmatute.springboot.restapisample.persistence.repository.CountryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CountryService {
    
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public CountryDTO findCountry(String name) {
        return countryMapper.toDTO(countryRepository.getCountries().get(name));
    }

}
