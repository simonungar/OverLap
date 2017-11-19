package com.example.simonungar.pageswitching;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FindEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_event);
    }
}
// TODO - the xml currently just has a search bar and 3 buttons. we need to get the search bar to search upon pressing <enter>
// TODO - and we also need the buttons to refresh the feed (which is in the space below) based on which button was pressed.