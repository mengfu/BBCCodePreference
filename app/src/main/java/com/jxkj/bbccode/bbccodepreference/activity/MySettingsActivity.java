package com.jxkj.bbccode.bbccodepreference.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ListView;

import com.jxkj.bbccode.bbccodepreference.R;
import com.jxkj.bbccode.bbccodepreference.adapter.ItemMenuAdapter;

/**
 * Created by hp on 2017/10/5.
 */

public class MySettingsActivity extends Activity {
    private ListView lv_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_settings);
        lv_settings=(ListView)findViewById(R.id.lv_settings);
        lv_settings.setAdapter(new ItemMenuAdapter());
        View viewA =this.getLayoutInflater().inflate(R.layout.activity_my_settings,null);

    }

    }
