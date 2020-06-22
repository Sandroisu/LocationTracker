package com.example.locationtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.location.LocationRequest;

public class MainActivity extends AppCompatActivity {

    private LocationRequest locationRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent serviceIntent = new Intent(this, LocationService.class);
        startForegroundService(serviceIntent);


    }

    private void updateLocation() {

    }

    public void scheduleJob(View v){

    }

    public void cancelJob (View v){

    }
}