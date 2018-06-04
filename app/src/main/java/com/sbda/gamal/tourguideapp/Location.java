package com.sbda.gamal.tourguideapp;

public class Location {
    private String City;
    private String street;

    public Location(String city, String street) {
        City = city;
        this.street = street;
    }

    public String getCity() {
        return City;
    }

    public String getStreet() {
        return street;
    }
}

