package com.example.joginderpal.allandroidanimations.Windows.topDown;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.joginderpal.allandroidanimations.R;

/**
 * Created by joginderpal on 28-05-2017.
 */

public class fragmentWindowsOne extends Fragment {

    RelativeLayout windowsRel;

    int i;

    public fragmentWindowsOne(int i) {

        this.i=(i%2);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_windows,container,false);

        windowsRel= (RelativeLayout) v.findViewById(R.id.rel_windows);

        switch (i){

            case 0:
                windowsRel.setBackgroundColor(Color.GREEN);
                break;
            case 1:
                windowsRel.setBackgroundColor(Color.RED);
                break;
        }


        return v;
    }
}
