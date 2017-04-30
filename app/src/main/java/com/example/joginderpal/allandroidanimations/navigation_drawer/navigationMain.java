package com.example.joginderpal.allandroidanimations.navigation_drawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.joginderpal.allandroidanimations.R;

/**
 * Created by joginderpal on 30-04-2017.
 */
public class navigationMain extends AppCompatActivity {


    Toolbar toolbar;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_main);
        toolbar= (Toolbar) findViewById(R.id.tooolbar);
        setSupportActionBar(toolbar);
        recyclerView= (RecyclerView) findViewById(R.id.rv_navigation_drawer);
        layoutManager=new LinearLayoutManager(navigationMain.this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecyclerAdapterNavigation();
        recyclerView.setAdapter(adapter);
    }
}
