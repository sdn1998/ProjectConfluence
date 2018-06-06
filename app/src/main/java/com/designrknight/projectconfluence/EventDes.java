package com.designrknight.projectconfluence;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import static com.designrknight.projectconfluence.UserProfile.lv;

public class EventDes extends AppCompatActivity {
    private ImageView img;
    private TextView cont;
    private ImageLoader imageLoader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_des);
        Intent i = getIntent();
        Bundle extras = i.getExtras();
        if (extras == null) throw new AssertionError();
        String pos = extras.getString("Pass");
        int position = Integer.parseInt(pos);
        cont = findViewById(R.id.content);
        Event a=(Event) lv.getItemAtPosition(position);
        CollapsingToolbarLayout Tool= findViewById(R.id.CollToolbar);
        Tool.setTitle(a.getTitle());
        cont.setText(a.getContent());
        img=findViewById(R.id.EventImage);
        imageLoader= ImageLoader.getInstance();
        imageLoader.displayImage(a.getImgUrl(),img);
    }

}
