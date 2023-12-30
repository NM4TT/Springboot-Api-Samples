package com.nmatute.springboot.soapapisample.web.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.nmatute.springboot.soapapisample.domain.service.CountryService;
import com.nmatute.springboot.soapapisample.generated.country.GetCountryRequest;
import com.nmatute.springboot.soapapisample.generated.country.GetCountryResponse;

import lombok.RequiredArgsConstructor;

@Endpoint
@RequiredArgsConstructor
public class CountryEndpoint {

    private static final 
        String NAMESPACE_URI = "http://www.nmatute.com/soapapisample/generated/country";

    private final CountryService countryService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryService.findCountry(request.getName()));

        return response;
    }
}
