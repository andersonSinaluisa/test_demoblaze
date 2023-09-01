package org.andersonsinaluisa.demoblaze.model;

public class Person {

    private String name;

    private String country;

    private String city;

    private String creditCard;


    private String month;

    private String year;

    public Person(String name, String country, String city, String creditCard, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditCard = creditCard;
        this.month = month;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    public String getCountry(){
        return this.country;
    }

    public String getCity(){
        return this.city;
    }

    public String getCreditCard(){
        return this.creditCard;
    }

    public String getMonth(){
        return this.month;
    }

    public String getYear(){
        return this.year;
    }
}
