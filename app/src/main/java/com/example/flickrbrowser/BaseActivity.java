package com.example.flickrbrowser;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";
    static final String FLICKR_QUERY = "FLICKR_QUERY";
    static final String PHOTO_TRANSFER = "PHOTO_TRANSFER";


    void activateToolbar(boolean enableHome){
        ActionBar actionBar = getSupportActionBar();

        if (actionBar == null){
            androidx.appcompat.widget.Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

            if (toolbar != null){
                setSupportActionBar(toolbar);
                actionBar = getSupportActionBar();
            }
        }

        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(enableHome);
        }
    }
}
