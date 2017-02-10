package com.example.subsub.subapp;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.subsub.subapp.event.Event;

import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    protected void onResume() {
        super.onResume();
        startActivity(new Intent(this, MainActivity2.class));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("tag", "result");
    }

    @Subscribe
    public void eventReceive(Event event) {
        Log.d(TAG, "eventReceive. class:" + this.getClass().getSimpleName());
        finish();
    }
}
