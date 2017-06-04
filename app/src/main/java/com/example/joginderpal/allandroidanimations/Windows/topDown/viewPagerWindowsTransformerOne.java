package com.example.joginderpal.allandroidanimations.Windows.topDown;

import android.support.v4.view.ViewPager;
import android.view.View;


 /* PROBLEM IN TOP DOWN */



public class viewPagerWindowsTransformerOne implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        float pivotX=page.getWidth()/2;
        float pivotY=page.getHeight();

        page.setTranslationX(page.getWidth()*-1*position);


        if (position==-1){



        }
        else if (position<0 && position>-1){

            page.setPivotX(pivotX);
            page.setPivotY(pivotY);
            page.setRotationX(90*position);

        }


        if (position==1){



        }

        else if(position>=0&&position<1){

            page.setPivotX(0);
            page.setPivotY(0);
            page.setRotationX(-90*position);

        }

    }
}
