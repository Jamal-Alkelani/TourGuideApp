package com.sbda.gamal.tourguideapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends Fragment{

    private ArrayList<HotelsInfo> tour=new ArrayList<HotelsInfo>();
    public void setTour(ArrayList<HotelsInfo> tour){
        this.tour=tour;
    }

    public Hotels(ArrayList<HotelsInfo> tour){
        this.tour=tour;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=LayoutInflater.from(getContext()).inflate(R.layout.fragment_hotels,container,false);
        ListView listView=v.findViewById(R.id.listViewHotels);
        HotelListViewAdapter adapter=new HotelListViewAdapter(getContext(),0,tour);
        listView.setAdapter(adapter);
        return v;
    }
}