package com.example.joginderpal.allandroidanimations.cool_navigation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.joginderpal.allandroidanimations.R;

/**
 * Created by joginderpal on 09-05-2017.
 */
public class coolNavMain  extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView im,blackBerry;
    FrameLayout balloon_frame,blackBerry_frame,apple_frame,android_frame,account_frame,github_frame,drive_frame,plus_frame;
    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cool_nav_main);
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

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        toolbar.setNavigationIcon(null);


        DisplayMetrics displayMetrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        final int height=displayMetrics.heightPixels;


        im = (ImageView) findViewById(R.id.im_nav_cool);
        blackBerry= (ImageView) findViewById(R.id.im_blackberry);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.Tada).duration(200).repeat(2).playOn(im);

            }
        });

        blackBerry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        balloon_frame= (FrameLayout) findViewById(R.id.balloon_cool_frame);
        blackBerry_frame= (FrameLayout) findViewById(R.id.blackberry_cool_frame);
        apple_frame= (FrameLayout) findViewById(R.id.apple_cool_frame);
        android_frame= (FrameLayout) findViewById(R.id.android_cool_frame);
        account_frame= (FrameLayout) findViewById(R.id.account_cool_frame);
        github_frame= (FrameLayout) findViewById(R.id.github_cool_frame);
        drive_frame= (FrameLayout) findViewById(R.id.drive_cool_frame);
        plus_frame= (FrameLayout) findViewById(R.id.plus_cool_frame);
        balloon_frame.setAlpha(0);
        blackBerry_frame.setAlpha(0);
        apple_frame.setAlpha(0);
        android_frame.setAlpha(0);
        account_frame.setAlpha(0);
        github_frame.setAlpha(0);
        drive_frame.setAlpha(0);
        plus_frame.setAlpha(0);
        drawer.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(View drawerView) {

                balloon_frame.setAlpha(1);
                blackBerry_frame.setAlpha(1);
                apple_frame.setAlpha(1);
                android_frame.setAlpha(1);
                account_frame.setAlpha(1);
                github_frame.setAlpha(1);
                drive_frame.setAlpha(1);
                plus_frame.setAlpha(1);

                TranslateAnimation translateAnimation=new TranslateAnimation(0,0,height,0);
                TranslateAnimation translateAnimation1=new TranslateAnimation(0,0,height,0);
                TranslateAnimation translateAnimation2=new TranslateAnimation(0,0,height,0);
                TranslateAnimation translateAnimation3=new TranslateAnimation(0,0,height,0);
                TranslateAnimation translateAnimation4=new TranslateAnimation(0,0,height,0);
                TranslateAnimation translateAnimation5=new TranslateAnimation(0,0,height,0);
                TranslateAnimation translateAnimation6=new TranslateAnimation(0,0,height,0);
                TranslateAnimation translateAnimation7=new TranslateAnimation(0,0,height,0);
                translateAnimation.setDuration(200);
                translateAnimation1.setDuration(300);
                translateAnimation2.setDuration(400);
                translateAnimation3.setDuration(500);
                translateAnimation4.setDuration(600);
                translateAnimation5.setDuration(700);
                translateAnimation6.setDuration(800);
                translateAnimation7.setDuration(900);
                balloon_frame.startAnimation(translateAnimation);
                blackBerry_frame.startAnimation(translateAnimation1);
                apple_frame.startAnimation(translateAnimation2);
                android_frame.startAnimation(translateAnimation3);
                account_frame.startAnimation(translateAnimation4);
                github_frame.startAnimation(translateAnimation5);
                drive_frame.startAnimation(translateAnimation6);
                plus_frame.startAnimation(translateAnimation7);

            }

            @Override
            public void onDrawerClosed(View drawerView) {

                balloon_frame.setAlpha(0);
                blackBerry_frame.setAlpha(0);
                apple_frame.setAlpha(0);
                android_frame.setAlpha(0);
                account_frame.setAlpha(0);
                github_frame.setAlpha(0);
                drive_frame.setAlpha(0);
                plus_frame.setAlpha(0);

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });


    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
