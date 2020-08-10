package com.saurabhthesuperhero.namobuddhay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void storietest(View view) {
        Intent  intent=new Intent(getApplicationContext(),stories.class);
        startActivity(intent);
    }

    public void fullstorietest(View view) {
        Intent  intent=new Intent(getApplicationContext(),fullstory.class);
        startActivity(intent);
    }

    public void homego(View view) {
        Intent  intent=new Intent(getApplicationContext(),Home.class);
        startActivity(intent);
    }
}
