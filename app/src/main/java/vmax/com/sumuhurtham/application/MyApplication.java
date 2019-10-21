package vmax.com.sumuhurtham.application;

import android.app.Application;
import android.content.Context;

import vmax.com.sumuhurtham.classes.LocaleHelper;

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base, "en"));
    }
}
