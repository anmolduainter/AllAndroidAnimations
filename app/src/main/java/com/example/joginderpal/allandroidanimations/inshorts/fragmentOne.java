package com.example.joginderpal.allandroidanimations.inshorts;

import android.annotation.SuppressLint;
import android.graphics.BlurMaskFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.joginderpal.allandroidanimations.R;

/**
 * Created by joginderpal on 22-04-2017.
 */
public class fragmentOne extends Fragment {

    int i;

    @SuppressLint("ValidFragment")
    fragmentOne(int i){
        this.i=i;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_one,container,false);
        ImageView im= (ImageView) v.findViewById(R.id.image_inshorts);
        switch(i){

            case 0:
                Glide.with(getContext()).load(R.drawable.first).into(im);
                Glide.with(getContext()).load(R.drawable.first).into(im);


        }
        return v;
    }
}
