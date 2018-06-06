package com.designrknight.projectconfluence;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserProfile extends AppCompatActivity {
    private TextView Payment;
    private TextView College;
    private ImageView Image;
    public static ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        CollapsingToolbarLayout a= findViewById(R.id.CollToolbar);
        a.setTitle("Abishek Philip");
        College=findViewById(R.id.college);
        Payment=findViewById(R.id.paymentstatus);
        Image=findViewById(R.id.UserImage);
        Payment.setText("Payment Successful");
        College.setText("NIT Rourkela");
        Image.setImageResource(R.drawable.profile);
        setTitle(getIntent().getStringExtra("Abishek Philip"));
        lv =findViewById(R.id.eventregister);
        ArrayList<Event> List=new ArrayList<>();
        List.add(new Event("Aero Show","drawable://" + R.drawable.aeroshow,"STC Stadium\n10 AM-4 PM"));
        List.add(new Event("CS:GO","drawable://" + R.drawable.csgoevent,"LA 204\n2 PM-5 PM"));
        List.add(new Event("EDM","drawable://" + R.drawable.edm,"DTS\n10 AM-4 PM"));
        UserAdapter adp=new UserAdapter(this, R.layout.activity_eventuser,List);
        lv.setAdapter(adp);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent p=new Intent(UserProfile.this,EventDes.class);
                p.putExtra("Pass",i+"");
                startActivity(p);
            }
        });
    }
    public void clic(View view)
    {
        Intent i=new Intent(this,QRCodeActivity.class);
        startActivity(i);
    }

}
