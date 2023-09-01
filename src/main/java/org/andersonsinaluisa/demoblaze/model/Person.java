package org.andersonsinaluisa.demoblaze.model;

import lombok.Getter;
import lombok.Setter;

public class Person {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String country;

    @Getter
    @Setter
    private String city;

    @Getter
    @Setter
    private String creditCard;

    @Getter
    @Setter
    private String month;
    @Getter
    @Setter
    private String year;

    public Person(String name, String country, String city, String creditCard, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditCard = creditCard;
        this.month = month;
        this.year = year;
    }
}
