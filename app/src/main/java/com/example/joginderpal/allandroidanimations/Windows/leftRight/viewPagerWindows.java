package com.example.joginderpal.allandroidanimations.Windows.leftRight;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by joginderpal on 28-05-2017.
 */

public class viewPagerWindows extends ViewPager {

    public viewPagerWindows(Context context) {

        super(context);

    }

    public viewPagerWindows(Context context, AttributeSet attrs) {
        super(context, attrs);

        setPageTransformer(true,new viewPagerWindowsTransformer());
        setOverScrollMode(OVER_SCROLL_NEVER);
    }



}
