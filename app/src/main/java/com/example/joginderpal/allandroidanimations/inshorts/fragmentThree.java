package com.example.joginderpal.allandroidanimations.inshorts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.joginderpal.allandroidanimations.R;

/**
 * Created by joginderpal on 22-04-2017.
 */
public class fragmentThree extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_three,container,false);
        return v;
    }
}
