package com.sbda.gamal.tourguideapp;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ArrayList<ToursInfo> toursInfo;
    private ArrayList<HotelsInfo> hotelsInfo;
    private ImageView coverImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coverImage=findViewById(R.id.coverImage);
        coverImage.setImageResource(getIntent().getIntExtra("coverImage",0));
        toursInfo=new ArrayList<ToursInfo>();
        hotelsInfo=new ArrayList<HotelsInfo>();
        ArrayList<String> tourNames=getIntent().getStringArrayListExtra("tourName");
        ArrayList<String> distances=getIntent().getStringArrayListExtra("distance");
        ArrayList<Integer> tourImages=getIntent().getIntegerArrayListExtra("tourImage");
        for(int i=0;i<tourImages.size();i++){
            toursInfo.add(new ToursInfo(tourNames.get(i),tourImages.get(i),distances.get(i),new Location("xyz","xyz")));
        }

        ArrayList<String> hotelNames=getIntent().getStringArrayListExtra("hotelName");
        ArrayList<String> prices=getIntent().getStringArrayListExtra("price");
        ArrayList<Integer> hotelImages=getIntent().getIntegerArrayListExtra("hotelImage");
        for(int i=0;i<hotelNames.size();i++){
            hotelsInfo.add(new HotelsInfo(hotelNames.get(i),hotelImages.get(i),prices.get(i),new Location("xyz","xyz")));

        }

        setUpNavigationDrawer();
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        SampleFragmentPagerAdapter fragmentPagerAdapter=new SampleFragmentPagerAdapter(getSupportFragmentManager(),
                MainActivity.this,toursInfo,hotelsInfo);

        viewPager.setAdapter(fragmentPagerAdapter);
        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        fragmentPagerAdapter.setTabIcons(tabLayout);
    }


    private void setUpNavigationDrawer() {
        drawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        drawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

                drawerLayout.openDrawer(GravityCompat.START);
                return true;

    }
}
