package com.example.joginderpal.allandroidanimations.float_anim;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

import com.example.joginderpal.allandroidanimations.R;

/**
 * Created by joginderpal on 18-04-2017.
 */
public class float_activity extends AppCompatActivity {


    FloatingActionButton fab,fab1,fab2,fab3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fabs);
        fab= (FloatingActionButton) findViewById(R.id.fb_float);
        fab1= (FloatingActionButton) findViewById(R.id.sub_fb_float_one);
        fab2= (FloatingActionButton) findViewById(R.id.sub_fb_float_two);
        fab3= (FloatingActionButton) findViewById(R.id.sub_fb_float_three);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate1();
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate2();
            }
        });

    }

    public void animate1(){

        fab1.setVisibility(View.VISIBLE);
        fab2.setVisibility(View.VISIBLE);
        fab3.setVisibility(View.VISIBLE);
        AnimationSet anim=new AnimationSet(true);
        TranslateAnimation translateAnimation=new TranslateAnimation(0,0,200,0);
        translateAnimation.setDuration(800);
        anim.addAnimation(translateAnimation);
        fab1.startAnimation(anim);
        TranslateAnimation translateAnimation1=new TranslateAnimation(0,0,400,0);
        translateAnimation1.setDuration(500);
        fab2.startAnimation(translateAnimation1);
        TranslateAnimation translateAnimation2=new TranslateAnimation(0,0,600,0);
        translateAnimation2.setDuration(300);
        fab3.startAnimation(translateAnimation2);

    }

    public void animate2(){

        AlphaAnimation animation=new AlphaAnimation(1,0);
        animation.setDuration(5000);
        fab1.startAnimation(animation);
        fab2.startAnimation(animation);
        fab3.startAnimation(animation);

    }



}
