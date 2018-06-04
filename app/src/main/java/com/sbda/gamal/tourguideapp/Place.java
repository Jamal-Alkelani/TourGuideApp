package com.sbda.gamal.tourguideapp;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;



public class Place  {

    public String name;
    public int image;
    public String description;
    ArrayList<ToursInfo> toursInfo;
    ArrayList<AudioGuide> audioGuide;
    ArrayList <HotelsInfo> hotels;
    ArrayList<Eat> eat;
    public Place(String name, int image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;
        toursInfo=new ArrayList<ToursInfo>();
        hotels=new ArrayList<HotelsInfo>();
    }


    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public ArrayList<ToursInfo> getToursInfo() {
        return toursInfo;
    }

    public void setToursInfo(ToursInfo toursInfo) {
        this.toursInfo.add(toursInfo);
    }

    public ArrayList<AudioGuide> getAudioGuide() {
        return audioGuide;
    }

    public void setAudioGuide(ArrayList<AudioGuide> audioGuide) {
        this.audioGuide = audioGuide;
    }


    public ArrayList<HotelsInfo> getHotels() {
        return hotels;
    }

    public void setHotels(ArrayList<HotelsInfo> hotels) {
        this.hotels = hotels;
    }

    public ArrayList<Eat> getEat() {
        return eat;
    }

    public void setEat(ArrayList<Eat> eat) {
        this.eat = eat;
    }

    public String getDescription() {
        return description;
    }

}
