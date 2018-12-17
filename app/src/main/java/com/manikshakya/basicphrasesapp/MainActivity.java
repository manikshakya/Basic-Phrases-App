package com.manikshakya.basicphrasesapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {




    public void buttonTapped(View view){
        String realId = getResources().getResourceEntryName(view.getId());


        int resourceId = getResources().getIdentifier(realId, "raw", getPackageName());
        MediaPlayer play = MediaPlayer.create(this, resourceId);

        play.start();
        //Log.i("Button Tapped: ", realId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
