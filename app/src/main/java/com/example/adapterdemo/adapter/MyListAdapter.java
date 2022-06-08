package com.example.adapterdemo.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adapterdemo.R;


public class MyListAdapter extends ArrayAdapter<String> {

    TextView txtSubject,txtDate,txtTime,txtRoom;

    private final Activity context;
    private final String[] subject;
    private final String[] date;
    private final String[] time;
    private final String[] room;
    public MyListAdapter(Activity context, String[] subject,String[] date,String[] time,String[] room) {
        super(context, R.layout.list_item, subject);
        // TODO Auto-generated constructor stub
        this.context=context;
        this.subject=subject;
        this.date=date;
        this.time=time;
        this.room=room;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_item, null,true);
        txtSubject = (TextView) rowView.findViewById(R.id.subject_title_news);
        txtDate = (TextView) rowView.findViewById(R.id.date_exam_news);
        txtTime = (TextView) rowView.findViewById(R.id.time_exam_news);
        txtRoom = (TextView) rowView.findViewById(R.id.room_exam_news);

        txtSubject.setText(subject[position]);
        txtDate.setText(date[position]);
        txtTime.setText(time[position]);
        txtRoom.setText(room[position]);
        return rowView;
    };

}




