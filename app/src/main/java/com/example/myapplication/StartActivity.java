package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    //final MediaPlayer Soundtest = Mediaplayer.create(this,R.raw.water);

    public void OnClick1(View v) {
    Button b1 = (Button) findViewById(R.id.butOption1);
    b1.setVisibility(View.GONE);
    Button b4 = (Button) findViewById(R.id.butOption4);
    b4.setVisibility(View.VISIBLE);
    ConstraintLayout e1 = (ConstraintLayout) findViewById(R.id.extra1);
    e1.setVisibility(View.VISIBLE);
    ConstraintLayout e2 = (ConstraintLayout) findViewById(R.id.extra2);
    e2.setVisibility(View.GONE);
    }

    public void OnClick2(View v) {
        Button b2 = (Button) findViewById(R.id.butOption2);
        b2.setVisibility(View.GONE);
        Button b5 = (Button) findViewById(R.id.butOption5);
        b5.setVisibility(View.VISIBLE);
        ConstraintLayout e2 = (ConstraintLayout) findViewById(R.id.extra2);
        e2.setVisibility(View.VISIBLE);
        ConstraintLayout e1 = (ConstraintLayout) findViewById(R.id.extra1);
        e1.setVisibility(View.GONE);
    }

    public void OnClick3(View v) {
        Button b3 = (Button) findViewById(R.id.butOption3);
        b3.setVisibility(View.GONE);
        Button b6 = (Button) findViewById(R.id.butOption6);
        b6.setVisibility(View.VISIBLE);
        ConstraintLayout e1 = (ConstraintLayout) findViewById(R.id.extra1);
        e1.setVisibility(View.GONE);
        ConstraintLayout e2 = (ConstraintLayout) findViewById(R.id.extra2);
        e2.setVisibility(View.GONE);
    }

    public void OnClick4(View v) {
        Button b4 = (Button) findViewById(R.id.butOption4);
        b4.setVisibility(View.GONE);
        ConstraintLayout e1 = (ConstraintLayout) findViewById(R.id.extra1);
        e1.setVisibility(View.GONE);
        ConstraintLayout e2 = (ConstraintLayout) findViewById(R.id.extra2);
        e2.setVisibility(View.GONE);
    }

    public void OnClick5(View v) {
        Button b5 = (Button) findViewById(R.id.butOption5);
        b5.setVisibility(View.GONE);
        ConstraintLayout e1 = (ConstraintLayout) findViewById(R.id.extra1);
        e1.setVisibility(View.GONE);
        ConstraintLayout e2 = (ConstraintLayout) findViewById(R.id.extra2);
        e2.setVisibility(View.GONE);
    }

    public void OnClick6(View v) {
        Button b6 = (Button) findViewById(R.id.butOption6);
        b6.setVisibility(View.GONE);
        ConstraintLayout e1 = (ConstraintLayout) findViewById(R.id.extra1);
        e1.setVisibility(View.GONE);
        ConstraintLayout e2 = (ConstraintLayout) findViewById(R.id.extra2);
        e2.setVisibility(View.GONE);
    }

    public void OnClick1_1(View v) {
        Button b1_1 = (Button) findViewById(R.id.butOption1_1);
        b1_1.setVisibility(View.GONE);
    }

    public void OnClick2_1(View v) {
        Button b2_1 = (Button) findViewById(R.id.butOption2_1);
        b2_1.setVisibility(View.GONE);
    }

    public void OnClick2_2(View v) {
        Button b2_2 = (Button) findViewById(R.id.butOption2_2);
        b2_2.setVisibility(View.GONE);
    }
}
