package com.regent.tech.ramadanguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cast the ViewPager and find it from the activity_main
        viewPager = (ViewPager) findViewById(R.id.view_pager);



    }
}
