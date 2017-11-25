package com.example.simonungar.pageswitching;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FindEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_event);

        EditText personName = (EditText) findViewById(R.id.editText);
        Button time = (Button) findViewById(R.id.button);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), HomePage.class);
                startActivity(intent);

            }
        });
        Button location = (Button) findViewById(R.id.button);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), HomePage.class);
                startActivity(intent);

            }
        });
        Button activity = (Button) findViewById(R.id.button);
        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), HomePage.class);
                startActivity(intent);

            }
        });
    }
}
// TODO - the xml currently just has a search bar and 3 buttons. we need to get the search bar to search upon pressing <enter>
// TODO - and we also need the buttons to refresh the feed (which is in the space below) based on which button was pressed.