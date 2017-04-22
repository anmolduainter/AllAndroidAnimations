package com.example.joginderpal.allandroidanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv= (RecyclerView) findViewById(R.id.recycler_view);
        layoutManager=new LinearLayoutManager(MainActivity.this);
        rv.setLayoutManager(layoutManager);
        adapter=new RecyclerAdapter(MainActivity.this);
        rv.setAdapter(adapter);

    }
}
