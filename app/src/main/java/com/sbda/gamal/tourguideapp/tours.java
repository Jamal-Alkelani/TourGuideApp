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

public class tours extends Fragment{

    private ArrayList<ToursInfo> tour=new ArrayList<ToursInfo>();
    public void setTour(ArrayList<ToursInfo> tour){
        this.tour=tour;
    }

    public tours(ArrayList<ToursInfo> tour){
        this.tour=tour;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=LayoutInflater.from(getContext()).inflate(R.layout.fragment_tours,container,false);
        ListView listView=v.findViewById(R.id.listView);
        MainListViewAdapter adapter=new MainListViewAdapter(getContext(),0,tour);
        listView.setAdapter(adapter);
        return v;
    }
}