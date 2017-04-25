package com.example.joginderpal.allandroidanimations.wynk;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.example.joginderpal.allandroidanimations.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joginderpal on 25-04-2017.
 */
public class wynk_main extends AppCompatActivity {


    ViewPagerCust_wynk viewPagerCust_wynk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wynk_main);
        viewPagerCust_wynk= (ViewPagerCust_wynk) findViewById(R.id.wynk_view_pager);
        MyPageAdapter myPageAdapter=new MyPageAdapter(getSupportFragmentManager());
        for (int i=0;i<5;i++){
            myPageAdapter.addFragment(new fragment_one_wynk());
        }
        viewPagerCust_wynk.setAdapter(myPageAdapter);

    }


    public class MyPageAdapter extends FragmentPagerAdapter{

        List<Fragment> li=new ArrayList<>();

        public MyPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return li.get(position);
        }

        @Override
        public int getCount() {
            return li.size();
        }
        public void addFragment(Fragment a){
            li.add(a);
        }
    }


}
