package com.example.joginderpal.allandroidanimations.Arc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.joginderpal.allandroidanimations.R;

/**
 * Created by joginderpal on 14-05-2017.
 */
public class arc_main_two extends AppCompatActivity {

    FloatingActionButton fab;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arc_main_two);
        fab= (FloatingActionButton) findViewById(R.id.fab_arc_main_two);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





            }
        });

    }
}
