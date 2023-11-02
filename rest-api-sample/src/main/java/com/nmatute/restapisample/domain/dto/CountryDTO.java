package com.nmatute.restapisample.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguageDTO {
    private String name;
    private String capital;
    private Long population;
    private CurrencyDTO currency;

    public static enum CurrencyDTO {

        GBP,
        EUR,
        PLN;
    
        public String value() {
            return name();
        }
    
        public static Currency fromValue(String v) {
            return valueOf(v);
        }
    
    }

}