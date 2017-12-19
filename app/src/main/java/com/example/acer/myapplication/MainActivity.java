package com.example.acer.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Acer on 12/19/2017.
 */

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvusername)TextView tvusername;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TextView tvUSername = (TextView) findViewById(R.id.tvusername);

        setContentView(R.layout.normallayout);
        ButterKnife.bind(MainActivity.this);
        String username = getIntent().getStringExtra("username");
        tvusername.setText(username);
    }
}
