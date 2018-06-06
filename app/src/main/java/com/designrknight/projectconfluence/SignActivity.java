package com.designrknight.projectconfluence;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signactivity);
    }
    public void cli(View view)
    {
        Intent i=new Intent(getApplicationContext(),SignActivity2.class);
        startActivity(i);
    }
}
