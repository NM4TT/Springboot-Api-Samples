package com.nmatute.soapapisample.web.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.nmatute.soapapisample.constant.Constants;
import com.nmatute.soapapisample.domain.service.CountryService;
import com.nmatute.soapapisample.generated.GetCountryRequest;
import com.nmatute.soapapisample.generated.GetCountryResponse;

import lombok.RequiredArgsConstructor;

@Endpoint
@RequiredArgsConstructor
public class CountryEndpoint {

    @Value("${namespace.country}")
    private final String NAMESPACE_URI;

    private final CountryService countryService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryService.findCountry(request.getName()));

        return response;
    }
}
