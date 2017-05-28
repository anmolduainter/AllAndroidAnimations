package com.example.joginderpal.allandroidanimations.Windows.leftRight;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by joginderpal on 28-05-2017.
 */

public class viewPagerWindowsTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        float pivotX=page.getWidth();
        float pivotY=page.getHeight()/2;



        if (position==-1){


            page.setPivotX(0f);
            page.setPivotY(0f);
            page.setRotationY(90);

        }
        else if (position<0 && position>-1){

            page.setPivotX(pivotX);
            page.setPivotY(pivotY);

            page.setRotationY(45*position);
        }


        if (position==1){

            page.setPivotX(0f);
            page.setPivotY(page.getHeight()/2);
            page.setRotationY(-90);

        }

        if(position>=0&&position<1){

            page.setPivotX(0);
            page.setPivotY(page.getHeight()/2);
            page.setRotationY(45*position);

        }






    }
}
