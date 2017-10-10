package com.jxkj.bbccode.bbccodepreference;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.jxkj.bbccode.bbccodepreference.activity.MyPreferenceActivity;
import com.jxkj.bbccode.bbccodepreference.activity.MySettingsActivity;
import com.jxkj.bbccode.bbccodepreference.fragment.HomeFragment;
import com.jxkj.bbccode.bbccodepreference.fragment.MyPreferenceFragment;
import com.jxkj.bbccode.bbccodepreference.fragment.WebviewFragment;
import com.jxkj.bbccode.bbccodepreference.utils.BottomNavigationViewHelper;
import com.jxkj.bbccode.bbccodepreference.viewpager.NoSlidingViewPaper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private NoSlidingViewPaper viewPager;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_notifications:

                    return true;
                case R.id.navigation_my:
                    //mTextMessage.setText(R.string.title_my);
                    //加载PrefFragment

                    Intent it=new Intent(MainActivity.this, MySettingsActivity.class);
                    startActivity(it);

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (NoSlidingViewPaper) findViewById(R.id.vp_main_container);
        final ArrayList<Fragment> fgLists = new ArrayList<>(2);
        //cycleViewPager=new CycleViewPager();
        HomeFragment homeFragment=new HomeFragment();
        //fgLists.add(cycleViewPager);
        fgLists.add(new WebviewFragment());
        fgLists.add(new WebviewFragment());

        FragmentPagerAdapter mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fgLists.get(position);
            }

            @Override
            public int getCount() {
                return fgLists.size();
            }
        };
        viewPager.setAdapter(mAdapter);
        viewPager.setOffscreenPageLimit(1); //预加载剩下两页
        viewPager.setCurrentItem(0);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        SharedPreferences mySharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String my_edittext_preference = mySharedPreferences.getString("myname", "");
        my_edittext_preference = mySharedPreferences.getString("mycity", "");
    }

}
