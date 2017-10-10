package com.jxkj.bbccode.bbccodepreference.application;

import android.app.Application;

/**
 * Created by hp on 2017/10/6.
 */

public class GlobalApplication extends Application {
    private static GlobalApplication instance=null;
    @Override
    public void onCreate() {
        super.onCreate();
        this.instance=this;
    }
    public static GlobalApplication getInstance(){
        return instance;
    }
}
