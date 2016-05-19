package com.example.mohit.fragments_2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentB extends Fragment {

    TextView tv;

    public FragmentB() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b,container,false);

        tv = (TextView) view.findViewById(R.id.text1);
        return view;
    }

    public void changeData(int index){
        String[] description = getResources().getStringArray(R.array.details);
        tv.setText(description[index]);
    }
}
