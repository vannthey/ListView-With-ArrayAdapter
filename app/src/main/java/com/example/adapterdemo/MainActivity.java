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

    String[] Title_program={"Java Programing","C Programing","PhP Programing","Python Programing"};
    Integer[] Icon_program={R.drawable.java_icon,R.drawable.c_icon,R.drawable.php_icon,R.drawable.pyton_icon};
    String[] Sub_title={"This is Java","This is C","This is Php","This is Python"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this,Title_program,Sub_title,Icon_program);

        ListView list=findViewById(R.id.listView);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              //  Toast.makeText(getApplicationContext(),i,Toast.LENGTH_SHORT).show();

                //create ob
                Intent intent = new Intent(MainActivity.this, detail.class);

                //put data
                intent.putExtra("Title", Title_program[i]);
                intent.putExtra("Subtitle",Sub_title[i]);
                intent.putExtra("Icon", Icon_program[i]);
                startActivity(intent);
            }
        });


    }
}