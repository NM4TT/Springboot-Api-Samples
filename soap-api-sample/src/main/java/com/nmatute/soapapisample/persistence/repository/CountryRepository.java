package com.nmatute.soapapisample.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nmatute.soapapisample.generated.Country;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
@Getter
public class CountryRepository {

    private final Map<String, Country> countries = new HashMap<>();

}
