package com.example.subsub.subapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.subsub.subapp.event.Event;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * Created by hilo on 2017/02/11.
 */

public class BaseActivity extends Activity {

    protected  static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, String.format("%s onCreate", this.getClass().getSimpleName()));
        EventBus.getDefault().register(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, String.format("%s onDestroy", this.getClass().getSimpleName()));
        EventBus.getDefault().unregister(this);
    }

}
