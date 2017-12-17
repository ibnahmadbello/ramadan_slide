package com.regent.tech.ramadanguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by root on 12/16/17.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(FragmentManager fm){super(fm);}

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new SlideOne();
            case 1:
                return new SlideTwo();
            case 2:
                return new SlideThree();
            case 3:
                return new SlideFour();
            case 4:
                return new SlideFive();
        }
        return null;
    }

    @Override
    public int getCount(){
        return 5;
    }
}
