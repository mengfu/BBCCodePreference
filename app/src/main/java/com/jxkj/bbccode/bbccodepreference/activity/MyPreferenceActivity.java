package com.jxkj.bbccode.bbccodepreference.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jxkj.bbccode.bbccodepreference.R;
import com.jxkj.bbccode.bbccodepreference.fragment.MyPreferenceFragment;

public class MyPreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_preference);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        MyPreferenceFragment prefFragment = new MyPreferenceFragment();
        transaction.add(R.id.mypreferenceactivity,prefFragment);
        transaction.commit();
    }
}
