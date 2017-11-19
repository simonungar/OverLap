package com.example.simonungar.pageswitching;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ImageView icon = new ImageView(this); // Create an icon
        icon.setImageDrawable(getDrawable(R.drawable.add));

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this).setContentView(icon).build();
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);

        ImageView itemIcon= new ImageView(this);
        itemIcon.setImageDrawable(getDrawable(R.drawable.schedule));
        SubActionButton button1 = itemBuilder.setContentView(itemIcon).build();

        ImageView itemIcon2= new ImageView(this);
        itemIcon2.setImageDrawable(getDrawable(R.drawable.createevent));
        SubActionButton button2 = itemBuilder.setContentView(itemIcon2).build();

        ImageView itemIcon3= new ImageView(this);
        itemIcon3.setImageDrawable(getDrawable(R.drawable.findevent1));
        SubActionButton button3 = itemBuilder.setContentView(itemIcon3).build();

        ImageView itemIcon4= new ImageView(this);
        itemIcon4.setImageDrawable(getDrawable(R.drawable.newfriend));
        SubActionButton button4 = itemBuilder.setContentView(itemIcon4).build();

        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this).addSubActionView(button1).addSubActionView(button2).addSubActionView(button3).addSubActionView(button4).attachTo(actionButton).build();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (view.getContext(), Schedule.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (view.getContext(), EventCreator.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (view.getContext(), FindEvent.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (view.getContext(), AddFriend.class);
                startActivity(intent);
            }
        });
    }

}

// TODO - we need to format the HOMEPAGE xml, and create a dynamic list that will parse the event data into some GUI representation

