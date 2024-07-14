package com.oneteamplus.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);
        Intent intent = getIntent();
        String json = intent.getStringExtra("data");
        ResModel resModel = ResModel.fromJson(json);
        TextView output = findViewById(R.id.displayed_text);
        if (output != null && resModel != null) {
            output.setText(String.format("%s", resModel.getFull_name()));
        } else {
            return;
        }

    }
}