package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static com.example.myapplication.R.layout.activity_main;

public class Main2Activity extends AppCompatActivity {

    //Button wllt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button import_W = (Button)findViewById(R.id.import_Button);
        Button create_W = (Button)findViewById(R.id.createWalletButton);

            import_W.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(activity_main);
                }

            } );


            create_W.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View j) {
                    setContentView(activity_main);
                }

            } );


    }











}
