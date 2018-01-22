package com.regent.tech.ramadanguide;

import android.support.annotation.IdRes;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cast the ViewPager and find it from the activity_main
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        //Cast the RadioGroup and find it from the activity_main
        radioGroup = (RadioGroup) findViewById(R.id.page_indicator);

        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.slide_one:
                        viewPager.setCurrentItem(0, true);
                        break;
                    case R.id.slide_two:
                        viewPager.setCurrentItem(1, true);
                        break;
                    case R.id.slide_three:
                        viewPager.setCurrentItem(2, true);
                        break;
                    case R.id.slide_four:
                        viewPager.setCurrentItem(3, true);
                        break;
                    case R.id.slide_five:
                        viewPager.setCurrentItem(4, true);
                        break;
                }
            }
        });

    }
}
