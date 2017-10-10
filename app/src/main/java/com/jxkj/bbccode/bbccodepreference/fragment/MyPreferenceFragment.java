package com.jxkj.bbccode.bbccodepreference.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.jxkj.bbccode.bbccodepreference.R;

/**
 * Created by hp on 2017/10/5.
 */

public class MyPreferenceFragment extends PreferenceFragment {
    @Override
  public void onCreate(Bundle savedInstanceState) {
               // TODO Auto-generated method stub
              super.onCreate(savedInstanceState);

               //从xml文件加载选项    https://www.anxiuyun.com/web/article/12c2c2b2458548cca99fbb145324029c
              addPreferencesFromResource(R.xml.mypreference);
            }

}
