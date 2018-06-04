package com.sbda.gamal.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.List;
import java.util.zip.Inflater;

public class ListViewAdapter extends ArrayAdapter<Place> {


    public ListViewAdapter(@NonNull Context context, int resource, @NonNull List<Place> objects) {
        super(context, resource, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview=convertView;
        if(listview==null) {
                listview = LayoutInflater.from(getContext()).inflate(R.layout.main_list_item, parent, false);

        }
        TextView name;
        TextView desc;
        ImageView image;
        TextView distance_duration;
                name =listview.findViewById(R.id.cityName);
                desc=listview.findViewById(R.id.descName);
                image=listview.findViewById(R.id.cityImage);
                if(getItem(position).getDescription().length()<=45) {
                    desc.setText(getItem(position).getDescription());
                }
                else
                {
                    String nameWithDots=getItem(position).getDescription();
                    nameWithDots=String.copyValueOf(nameWithDots.toCharArray(),0,43)+"...";
                    desc.setText(nameWithDots);
                }
        image.setImageResource(getItem(position).getImage());
        name.setText(getItem(position).getName());
        return listview;

    }
}
