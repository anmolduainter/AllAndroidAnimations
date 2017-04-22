package com.example.joginderpal.allandroidanimations.inshorts;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.example.joginderpal.allandroidanimations.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joginderpal on 22-04-2017.
 */
public class inshorts_main extends AppCompatActivity {

    ViewPagerCust v;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inshorts_main);

        v= (ViewPagerCust) findViewById(R.id.viewPager);
        MyPagerAdapter adapter=new MyPagerAdapter(getSupportFragmentManager());
        for (int i=0;i<4;i++) {
            adapter.addFragment(new fragmentOne(i));
        }
        v.setAdapter(adapter);

    }

    private class MyPagerAdapter extends FragmentPagerAdapter{

       List<Fragment> fragmentList=new ArrayList<>();

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return fragmentList.get(position);

        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        public void addFragment(Fragment f){

            fragmentList.add(f);
        }


    }


    }




