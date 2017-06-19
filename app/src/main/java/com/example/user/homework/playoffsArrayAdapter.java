package com.example.user.homework;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class playoffsArrayAdapter extends ArrayAdapter<playoffs> {
    Context context;

    public playoffsArrayAdapter(Context context, ArrayList<playoffs> items) {
        super(context, 0,items);
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        LinearLayout itemlayout = null;
        if(convertView == null) {
            itemlayout = (LinearLayout)inflater.inflate
                    (R.layout.listitem, null);
        } else {
            itemlayout = (LinearLayout) convertView;

        }
        playoffs item = (playoffs)getItem(position);

        ImageView iv = (ImageView)itemlayout.
                findViewById(R.id.iv);
        iv.setImageResource(item.firstimgid);
        ImageView iv2 =(ImageView)itemlayout.
                findViewById(R.id.iv2);
        iv2.setImageResource(item.secondimgid);
        TextView tv_name = (TextView)itemlayout.
                findViewById(R.id.firstname);
        tv_name.setText(item.firstname);
        TextView tv_name2 = (TextView)itemlayout.
                findViewById(R.id.secondname);
        tv_name2.setText(item.secondname);
        TextView tv_times =(TextView)itemlayout.
                findViewById(R.id.firsttimes);
        String times1 = String.valueOf(item.firsttimes);
        tv_times.setText(times1);
        TextView tv_times2 =(TextView)itemlayout.
                findViewById(R.id.secondtimes);
        String times2 = String.valueOf(item.secondtimes);
        tv_times2.setText(times2);
        if(item.firsttimes > item.secondtimes){
            tv_times.setTextColor(Color.RED);
        }
        else
            tv_times2.setTextColor(Color.RED);

        return itemlayout;
    }
}
