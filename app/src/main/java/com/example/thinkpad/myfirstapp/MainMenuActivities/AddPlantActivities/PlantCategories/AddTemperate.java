package com.example.thinkpad.myfirstapp.MainMenuActivities.AddPlantActivities.PlantCategories;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.thinkpad.myfirstapp.MainMenuActivities.AddPlantActivities.AddPlantPopUps.TemperatePopUp;
import com.example.thinkpad.myfirstapp.R;

public class AddTemperate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_temperate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button popup = (Button) findViewById(R.id.addTemperatePopUp);
        popup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            // Starting a new Intent.
            Intent nextScreen = new Intent(getApplicationContext(), TemperatePopUp.class);
            startActivity(nextScreen);
            }
        });
    }
}