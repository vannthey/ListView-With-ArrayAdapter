package com.example.adapterdemo.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.adapterdemo.R;


public class MyListAdapter extends ArrayAdapter<String> {

    TextView Title,Subtitle;
    ImageView Image;

    private final Activity context;
    private final String[] Title_program;
    private final Integer[] Icon_program;
    private final String[] Sub_title;

    public MyListAdapter(Activity context, String[] Title_program,String[] Sub_title,Integer[] Icon_program) {
        super(context, R.layout.list_item, Title_program);
        this.context=context;
        this.Title_program=Title_program;
        this.Sub_title=Sub_title;
        this.Icon_program=Icon_program;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null,true);
        Title = (TextView) rowView.findViewById(R.id.title_program);
        Subtitle =(TextView) rowView.findViewById(R.id.sub_title);
        Image = (ImageView) rowView.findViewById(R.id.icon_program);

        Title.setText(Title_program[position]);
        Subtitle.setText(Sub_title[position]);
        Image.setImageResource(Icon_program[position]);
        return rowView;
    };

}




