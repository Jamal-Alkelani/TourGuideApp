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

public class HotelListViewAdapter extends ArrayAdapter<HotelsInfo> {


    public HotelListViewAdapter(@NonNull Context context, int resource, @NonNull List<HotelsInfo> objects) {
        super(context, resource, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview=convertView;
        if(listview==null) {
            listview = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }
        TextView name;
        TextView desc;
        ImageView image;
        TextView distance_duration;
        final LottieAnimationView animationView;

        name =listview.findViewById(R.id.textView2);
        distance_duration=listview.findViewById(R.id.textView3);
        image=listview.findViewById(R.id.imageView);
        animationView=(LottieAnimationView) listview.findViewById(R.id.heart);
        distance_duration.setText(getItem(position).getPrice());
        animationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationView.setAnimation(R.raw.heart);
                animationView.playAnimation();
                Toast.makeText(getContext(), "Added To The Liked Places", Toast.LENGTH_SHORT).show();
            }
        });

        image.setImageResource(getItem(position).getHotelImage());
        name.setText(getItem(position).getHotelName());
        return listview;

    }
}
