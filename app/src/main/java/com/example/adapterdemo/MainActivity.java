package com.example.adapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.adapterdemo.adapter.MyListAdapter;

public class MainActivity extends AppCompatActivity {

    String[] subject ={"Management Information System", "System Analyze", "Ecommerce"};
    String[] date ={"11,07,2022", "11,07,2022", "11,07,2022"};
    String[] time ={"6:00pm to 8:00pm", "6:00pm to 8:00pm", "6:00pm to 8:00pm"};
    String[] room ={"Preah Kan", "Preah Kan"," Preah Kan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this, subject, date, time, room);

        ListView list=findViewById(R.id.listView);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              //  Toast.makeText(getApplicationContext(),i,Toast.LENGTH_SHORT).show();

                //create ob
                Intent intent = new Intent(MainActivity.this, detail.class);

                //put data
                intent.putExtra("Subject", subject[i]);
                intent.putExtra("Date",date[i]);
                intent.putExtra("Time", time[i]);
                intent.putExtra("Room", room[i]);
                startActivity(intent);
            }
        });


    }
}