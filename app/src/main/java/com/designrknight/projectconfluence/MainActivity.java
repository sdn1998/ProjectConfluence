package com.designrknight.projectconfluence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image=findViewById(R.id.imageView);
        Utility.loadImage(getApplicationContext(),"http://mondaymorning.nitrkl.ac.in/uploads/post/DSC05325.jpg",R.mipmap.logo_front,image);
    }
}
