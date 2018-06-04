package com.sbda.gamal.tourguideapp;

import java.io.Serializable;

public class ToursInfo {
    private String tourDistance_time;
    private String tourName;
    private int tourImage;
    Location location;
    private String description;
    public ToursInfo(String tourName, int tourImage, String tourDistance_time,Location location) {

        this.tourName = tourName;
        this.tourDistance_time = tourDistance_time;
        this.tourImage = tourImage;
        this.location=location;
        this.description=description;
    }

    public String getTourDistance_time() {
        return tourDistance_time;
    }

    public String getTourName() {
        return tourName;
    }

    public int getTourImage() {
        return tourImage;
    }

    public Location getLocation() {
        return location;
    }
}
