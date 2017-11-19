package com.example.simonungar.pageswitching;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccountCreator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_creator);

        configureButtons();
    }

    public void configureButtons() {

        Button createAcct = (Button) findViewById(R.id.createAcct);
        createAcct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), HomePage.class); // clear activity stack, so android backbutton on homepage will exit out of the app
                boolean createAcctToken = true;
                /* TODO - pass username/email/password to back end, set $createAcctToken to true if it successfuly creates a user
                 TODO - otherwise, return false. */
                if (createAcctToken) {
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
            }
        });
    }
}
