package com.regent.tech.ramadanguide;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cast the ViewPager and find it from the activity_main
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        radioGroup.check(R.id.slide_one);
                        break;
                    case 1:
                        radioGroup.check(R.id.slide_two);
                        break;
                    case 2:
                        radioGroup.check(R.id.slide_three);
                        break;
                    case 3:
                        radioGroup.check(R.id.slide_four);
                        break;
                    case 4:
                        radioGroup.check(R.id.slide_five);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //Cast the RadioGroup and find it from the activity_main
        radioGroup = (RadioGroup) findViewById(R.id.page_indicator);


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.skip_now:
                Intent skipNowIntent = new Intent(this, ContentActivity.class);
                startActivity(skipNowIntent);
                return true;
            case R.id.skip_always:
                Intent skipAlwaysIntent = new Intent(this, ContentActivity.class);
                startActivity(skipAlwaysIntent);
                return true;
        }

        return super.onOptionsItemSelected(menuItem);
    }

}
