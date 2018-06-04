package com.sbda.gamal.tourguideapp;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[];
    private int tabIcons[]={R.drawable.outline_map_24,R.drawable.outline_volume_up_24,R.drawable.outline_hotel_24,R.drawable.outline_fastfood_24};
    private Context context;
    private ArrayList<ToursInfo> toursInfo;
    private ArrayList<HotelsInfo> hotelsInfo;
    public SampleFragmentPagerAdapter(FragmentManager fm, Context context,ArrayList<ToursInfo> toursInfo,ArrayList<HotelsInfo> hotelsInfo) {
        super(fm);
        this.context = context;
        this.toursInfo=toursInfo;
        this.hotelsInfo=hotelsInfo;
        tabTitles = new String[] {context.getString(R.string.tab_text_1),context.getString(R.string.tab_text_2),context.getString(R.string.tab_text_3),context.getString(R.string.tab_text_4)};
    }

    public void setTabIcons(TabLayout t){
        for(int i=0;i<PAGE_COUNT;i++){
            t.getTabAt(i).setIcon(tabIcons[i]);
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }



    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
               tours tours=new tours(toursInfo);
               return tours;

            case 1:
                break;
            case 2:
                return new Hotels(hotelsInfo);
            case 3:

                default:break;
        }

        tours tours=new tours(toursInfo);
        return tours;
    }
}