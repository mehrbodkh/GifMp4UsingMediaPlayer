package com.example.mehrbod.mediaplayerandroidgifplayback;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        List<GifModel> list = new ArrayList<>();
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));
        list.add(new GifModel("/storage/emulated/0/Download/ge.mp4"));


        GifAdapter adapter = new GifAdapter(this, list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

    }

}
