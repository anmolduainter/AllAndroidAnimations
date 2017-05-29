package com.example.joginderpal.allandroidanimations.Windows.topDown;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

import com.example.joginderpal.allandroidanimations.Windows.leftRight.viewPagerWindowsTransformer;

/**
 * Created by joginderpal on 28-05-2017.
 */

public class viewPagerWindowsOne extends ViewPager {

    public viewPagerWindowsOne(Context context) {

        super(context);

    }

    public viewPagerWindowsOne(Context context, AttributeSet attrs) {
        super(context, attrs);

        setPageTransformer(true,new viewPagerWindowsTransformerOne());
        setOverScrollMode(OVER_SCROLL_NEVER);
    }



}
