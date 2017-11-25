package com.example.simonungar.pageswitching;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EventCreator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_creator);

        Button createEvent = (Button) findViewById(R.id.button);
        createEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), HomePage.class);
                startActivity(intent);
                EditText activityName = (EditText) findViewById(R.id.editText6);
                EditText activityTime = (EditText) findViewById(R.id.editText10);
                EditText activityLocation = (EditText) findViewById(R.id.editText12);
                EditText activityDescription = (EditText) findViewById(R.id.editText13);
                EditText activitySpots = (EditText) findViewById(R.id.editText14);
                EditText activityDate = (EditText) findViewById(R.id.editText2);
            }
        });
    }
}
