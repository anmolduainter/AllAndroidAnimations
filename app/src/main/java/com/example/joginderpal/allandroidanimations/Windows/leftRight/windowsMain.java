package com.example.joginderpal.allandroidanimations.Windows.leftRight;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.example.joginderpal.allandroidanimations.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joginderpal on 28-05-2017.
 */

public class windowsMain extends AppCompatActivity {


    viewPagerWindows viewPagerWindows1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.windows_left_right_main);

        viewPagerWindows1= (com.example.joginderpal.allandroidanimations.Windows.leftRight.viewPagerWindows) findViewById(R.id.viewPager_windows);
        MyPagerAdapter myPagerAdapter=new MyPagerAdapter(getSupportFragmentManager());
        for (int i=0;i<5;i++){
            myPagerAdapter.addFragment(new fragmentWindows(i));
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
