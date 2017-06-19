package com.example.user.homework;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<playoffs> albumlist = new ArrayList<playoffs>();

        albumlist.add(new playoffs("公鹿",93,R.drawable.a00,
                "暴龍",118,R.drawable.a01));
        albumlist.add(new playoffs("巫師",101,R.drawable.a02,
                "老鷹", 111, R.drawable.a04));



        playoffsArrayAdapter adapter =
                new playoffsArrayAdapter(this, albumlist);

        lv = (ListView)findViewById(R.id.lv);
        lv.setAdapter(adapter);
    }

}
