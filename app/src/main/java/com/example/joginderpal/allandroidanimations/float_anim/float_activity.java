package com.example.joginderpal.allandroidanimations.float_anim;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
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

                AnimationSet anim=new AnimationSet(true);
                TranslateAnimation translateAnimation=new TranslateAnimation(0,0,200,0);
                RotateAnimation rotateAnimation=new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                rotateAnimation.setDuration(2000);
                anim.addAnimation(rotateAnimation);
                translateAnimation.setDuration(2000);
                anim.addAnimation(translateAnimation);
                fab1.startAnimation(anim);
                TranslateAnimation translateAnimation1=new TranslateAnimation(0,0,400,0);
                translateAnimation1.setDuration(1000);
                fab2.startAnimation(translateAnimation1);


            }
        });


    }
}
