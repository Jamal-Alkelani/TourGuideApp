package com.sbda.gamal.tourguideapp;

public class HotelsInfo {
    private String hotelName;
    private int hotelImage;
    Location location;
    private String price;

    public HotelsInfo(String hotelName, int hotelImage, String price, Location location) {
        this.hotelName = hotelName;
        this.hotelImage = hotelImage;
        this.location = location;
        this.price = price;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelImage() {
        return hotelImage;
    }

    public void setHotelImage(int hotelImage) {
        this.hotelImage = hotelImage;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
