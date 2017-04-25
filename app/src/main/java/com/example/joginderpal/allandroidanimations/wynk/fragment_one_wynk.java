package com.example.joginderpal.allandroidanimations.wynk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.joginderpal.allandroidanimations.R;

/**
 * Created by joginderpal on 25-04-2017.
 */
public class fragment_one_wynk extends Fragment {

    public fragment_one_wynk() {

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_one_wynk,container,false);
        return v;
    }
}
