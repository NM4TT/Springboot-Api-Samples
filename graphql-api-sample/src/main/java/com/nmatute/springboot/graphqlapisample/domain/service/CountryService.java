package com.nmatute.springboot.graphqlapisample.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nmatute.springboot.graphqlapisample.domain.dto.CountryDTO;
import com.nmatute.springboot.graphqlapisample.mapping.CountryMapper;
import com.nmatute.springboot.graphqlapisample.persistence.repository.CountryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CountryService {
    
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public List<CountryDTO> getAll() {
        return countryMapper.toDTOs(
            countryRepository
                .getCountries()
                .values()
                .stream()
                .collect(Collectors.toList())
        );
    }

    public CountryDTO getByName(String name) {
        return countryMapper.toDTO(countryRepository.getCountries().get(name));
    }

}
