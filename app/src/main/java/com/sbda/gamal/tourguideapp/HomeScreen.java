package com.sbda.gamal.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        ListView listView=(ListView) findViewById(R.id.homeListview);
        final ArrayList<Place> list=new ArrayList<Place>();

        Place place=new Place(getString(R.string.Location_City),R.drawable.italy,"The best place to spend holides and relax");
        place.setToursInfo(new ToursInfo("Naples",R.drawable.naples,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Cinque Terre",R.drawable.cinque_terre,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Milan ",R.drawable.cinque_terre,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Naples",R.drawable.naples,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Cinque Terre",R.drawable.cinque_terre,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Milan ",R.drawable.cinque_terre,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Naples",R.drawable.naples,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Cinque Terre",R.drawable.cinque_terre,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Milan ",R.drawable.cinque_terre,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Naples",R.drawable.naples,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Cinque Terre",R.drawable.cinque_terre,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Milan ",R.drawable.cinque_terre,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Naples",R.drawable.naples,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Cinque Terre",R.drawable.cinque_terre,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setToursInfo(new ToursInfo("Milan ",R.drawable.cinque_terre,getString(R.string.distance_time),new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        ArrayList<HotelsInfo> hotelsInfo=new ArrayList<HotelsInfo>();
        hotelsInfo.add(new HotelsInfo("ram ",R.drawable.ram,"100$ per day",new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        hotelsInfo.add(new HotelsInfo("amba ",R.drawable.amba,"150$ per day",new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        hotelsInfo.add(new HotelsInfo("rolies ",R.drawable.ram,"10$ per day",new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        hotelsInfo.add(new HotelsInfo("KSA ",R.drawable.ram,"80$ per day",new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        hotelsInfo.add(new HotelsInfo("brandHotels",R.drawable.ram,"950$ per day",new Location(getString(R.string.Location_City),getString(R.string.Location_Street))));
        place.setHotels(hotelsInfo);

        list.add(place);
        list.add(new Place("Spain",R.drawable.spain,"The best place to spend holides and relax"));
        list.add(new Place("Dominican",R.drawable.domincian,"The best place to spend holides and relax"));
        list.add(new Place("Palestine",R.drawable.palestine,"The best place to spend holides and relax"));
        list.add(new Place("Paris",R.drawable.sw1,"The best place to spend holides and relax"));



        ListViewAdapter adapter=new ListViewAdapter(getApplicationContext(),0,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                Bundle b=new Bundle();
                String []tourNames=new String[list.get(position).getToursInfo().size()];
                String []distances=new String[list.get(position).getToursInfo().size()];
                Integer [] tourImages=new Integer[list.get(position).getToursInfo().size()];

                String []hotelName=new String[list.get(position).getHotels().size()];
                String []prices=new String[list.get(position).getHotels().size()];
                Integer [] hotelImages=new Integer[list.get(position).getHotels().size()];

                for(int i=0;i<list.get(position).getToursInfo().size();i++){
                    String tourName= list.get(position).getToursInfo().get(i).getTourName();
                    String distance= list.get(position).getToursInfo().get(i).getTourDistance_time();
                    int tourImage=list.get(position).getToursInfo().get(i).getTourImage();
                    tourNames[i]=tourName;
                    distances[i]=distance;
                    tourImages[i]=tourImage;
                }

                for(int i=0;i<list.get(position).getHotels().size();i++){
                    String tourName= list.get(position).getHotels().get(i).getHotelName();
                    String distance= list.get(position).getHotels().get(i).getPrice();
                    int tourImage=list.get(position).getHotels().get(i).getHotelImage();
                    hotelName[i]=tourName;
                    prices[i]=distance;
                    hotelImages[i]=tourImage;
                }


                intent.putStringArrayListExtra("tourName",new ArrayList<String>(Arrays.asList(tourNames)));
                intent.putStringArrayListExtra("distance",new ArrayList<String>(Arrays.asList(distances)));
                intent.putIntegerArrayListExtra("tourImage",new ArrayList<Integer>(Arrays.asList(tourImages)));

                intent.putStringArrayListExtra("hotelName",new ArrayList<String>(Arrays.asList(hotelName)));
                intent.putStringArrayListExtra("price",new ArrayList<String>(Arrays.asList(prices)));
                intent.putIntegerArrayListExtra("hotelImage",new ArrayList<Integer>(Arrays.asList(hotelImages)));
                intent.putExtra("coverImage",list.get(position).getImage());
                startActivity(intent);
            }
        });
    }
}
