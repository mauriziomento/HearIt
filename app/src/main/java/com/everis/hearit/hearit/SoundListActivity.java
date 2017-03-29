package com.everis.hearit.hearit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class SoundListActivity extends AppCompatActivity {

    private RecyclerView list_recycler;
    private SoundListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        list_recycler = (RecyclerView) findViewById(R.id.list_recycler);

        setAdapter();
    }

    private ArrayList<Sound> getSoundList() {
        ArrayList<Sound> soundList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Sound s = new Sound();
            s.setName("Sound " + i);
            soundList.add(s);
        }
        return soundList;
    }

    private void setAdapter() {
        adapter = new SoundListAdapter(this, R.layout.adapter_row_sound_list, getSoundList());

        list_recycler.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        list_recycler.setItemAnimator(new DefaultItemAnimator());
        list_recycler.setAdapter(adapter);
    }
}
