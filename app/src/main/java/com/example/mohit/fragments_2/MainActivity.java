package com.example.mohit.fragments_2;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.Communicator{

    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        fragmentA = (FragmentA) manager.findFragmentById(R.id.fragment);
        fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment2);
        fragmentA.setCommunicator(this);

    }

    @Override
    public void respond(int index) {
        if(fragmentB != null && fragmentB.isVisible()){
            fragmentB.changeData(index);
        }
        else {
            Intent intent = new Intent(this,ActivityB.class);
            intent.putExtra("index",index);
            startActivity(intent);
        }
    }
}
