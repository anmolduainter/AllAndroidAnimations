package com.example.joginderpal.allandroidanimations.Windows.topDown;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.example.joginderpal.allandroidanimations.R;
import com.example.joginderpal.allandroidanimations.Windows.leftRight.fragmentWindows;
import com.example.joginderpal.allandroidanimations.Windows.leftRight.viewPagerWindows;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joginderpal on 28-05-2017.
 */

public class windowsMainOne extends AppCompatActivity {


    viewPagerWindowsOne viewPagerWindows1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.windows_top_down_main);

        viewPagerWindows1= (viewPagerWindowsOne) findViewById(R.id.viewpager_top_down);
        MyPagerAdapter myPagerAdapter=new MyPagerAdapter(getSupportFragmentManager());
        for (int i=0;i<5;i++){
            myPagerAdapter.addFragment(new fragmentWindowsOne(i));
        }
        viewPagerWindows1.setAdapter(myPagerAdapter);

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
