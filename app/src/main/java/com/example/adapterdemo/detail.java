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
        
        String Title = getIntent().getStringExtra("Title");
        String Subtitle = getIntent().getStringExtra("Subtitle");
        int Img = getIntent().getIntExtra("Icon",0);


        TextView title = findViewById(R.id.Title);
        TextView subtitle = findViewById(R.id.Subtitle);
        ImageView img =findViewById(R.id.Icon);

        title.setText(Title);
        subtitle.setText(Subtitle);
        img.setImageResource(Img);



        
    }
}