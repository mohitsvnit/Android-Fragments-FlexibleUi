package com.example.mohit.fragments_2;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.URISyntaxException;

public class ActivityB extends AppCompatActivity {

    int index;
    FragmentB fragmentB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Intent intent = getIntent();
        index = intent.getIntExtra("index",0);

        FragmentManager manager = getSupportFragmentManager();
        fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment2);
        fragmentB.changeData(index);


    }
}
