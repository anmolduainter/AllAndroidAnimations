package com.example.joginderpal.allandroidanimations.wynk;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by joginderpal on 25-04-2017.
 */
public class ViewPagerTransformer_wynk implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {



         /*  if (position<-1 || position>1){
               page.setAlpha(0);
           }*/

         if (position==-1){
               page.setTranslationX((page.getWidth()/2));
               page.setScaleX(0.5f);
               page.setScaleY(0.5f);
           }
         else if (position<0 && position>-1){
               page.setTranslationX(-(position*(page.getWidth()/2)));
               page.setScaleX(1f+(0.5f*position));
               page.setScaleY(1f+(0.5f*position));
           }


         if (position==1){

               page.setTranslationX(-(page.getWidth()/2));
               page.setScaleX(0.5f);
               page.setScaleY(0.5f);

           }

         if(position>=0&&position<1){

               page.setTranslationX(-(page.getWidth()/2*position));
               page.setScaleX(1f-0.5f*position);
               page.setScaleY(1f-0.5f*position);
           }



     /*   else if (position==1){

               page.setTranslationX(-(page.getWidth()/2));
               page.setScaleX(0.5f);
               page.setScaleY(0.5f);

           }
*/


    }
}
