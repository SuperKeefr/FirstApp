package com.example.student.myfirstapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class displayMsg extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "hmm";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_msg);
        TextView tv = new TextView(this);
        tv.setTextSize(40);
        tv.setText("hmm");
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.container);
        rl.addView(tv);
    }

}
