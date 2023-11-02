package com.nmatute.restapisample.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Country {
    
    @Id
    private String name;
    
    private String capital;

    private Long population;

    private Currency currency;

    public static enum Currency {

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