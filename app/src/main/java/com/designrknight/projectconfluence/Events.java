package com.designrknight.projectconfluence;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Events extends AppCompatActivity {
    private ListView ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);
        ls=findViewById(R.id.list);
        ArrayList<Event> List=new ArrayList<>();
        List.add(new Event("Aero Show","drawable://" + R.drawable.aeroshow,"STC Stadium\n10 AM-4 PM"));
        List.add(new Event("CS:GO","drawable://" + R.drawable.csgoevent,"LA 204\n2 PM-5 PM"));
        List.add(new Event("EDM","drawable://" + R.drawable.edm,"DTS\n10 AM-4 PM"));
        List.add(new Event("PreCongnition","drawable://" + R.drawable.precognition14,"BBA\n10 AM-4 PM"));
        List.add(new Event("Digitizer","drawable://" + R.drawable.images,"LA 101\n10 AM-4 PM"));
        List.add(new Event("LiftOff","drawable://" + R.drawable.liftoff,"LA 201\n10 AM-5 PM"));
        List.add(new Event("Sristi","drawable://" + R.drawable.sristi,"LA 401\n10 AM-5 PM"));
        List.add(new Event("Shake It Off","drawable://" + R.drawable.shakeitoff,"BBA\n10 AM-5 PM"));
        CustomAdapter adp=new CustomAdapter(this, R.layout.activity_events,List);
        ls.setAdapter(adp);
    }
}
