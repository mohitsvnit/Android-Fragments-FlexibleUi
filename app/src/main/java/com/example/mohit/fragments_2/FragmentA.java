package com.example.mohit.fragments_2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {

    ListView lv;
    Communicator comm;


    public FragmentA() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        lv = (ListView) view.findViewById(R.id.listView);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.names, android.R.layout.simple_list_item_1);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(this);

        comm = (Communicator) getActivity();
        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       // Toast.makeText(getContext(),Integer.toString(position),Toast.LENGTH_SHORT).show();
        comm.respond(position);
    }

    public void setCommunicator(Communicator communicator){
        this.comm = communicator;
    }

    public interface Communicator{
        public void respond(int index);
    }
}
