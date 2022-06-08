package com.example.adapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        
        String subject = getIntent().getStringExtra("Subject");
        String date = getIntent().getStringExtra("Date");
        String time = getIntent().getStringExtra("Time");
        String room = getIntent().getStringExtra("Room");

        TextView txt = findViewById(R.id.subject_title_news);
        txt.setText(subject);


        
    }
}