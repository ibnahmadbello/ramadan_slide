package com.regent.tech.ramadanguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by root on 12/16/17.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentPagerAdapter(FragmentManager fm){super(fm);}

    @Override
    public Fragment getItem(int position){

    }

    @Override
    public int getCount(){
        return 5;
    }
}
