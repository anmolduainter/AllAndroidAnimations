package com.example.joginderpal.allandroidanimations.wynk;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.example.joginderpal.allandroidanimations.R;
import com.squareup.picasso.Picasso;

import jp.wasabeef.glide.transformations.BlurTransformation;

/**
 * Created by joginderpal on 25-04-2017.
 */
public class fragment_one_wynk extends Fragment {

    int i;
    RelativeLayout rl;

    public fragment_one_wynk(RelativeLayout rl, int i) {

        this.i=i;
        this.rl=rl;

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_one_wynk,container,false);
        ImageView im= (ImageView) v.findViewById(R.id.image_wynk);
   //     rl= (RelativeLayout) v.findViewById(R.id.rel_wynk);
        final int a=i%3;

        switch(a){

            case 0:
                Picasso.with(getContext()).load("http://i.ndtvimg.com/i/2016-10/vodafone_650x400_61477470270.jpg").fit().into(im);
                break;
            case 1:
                Picasso.with(getContext()).load("http://i.ndtvimg.com/i/2017-04/2017-maruti-suzuki-swift-dzire_827x510_41492771877.jpg").fit().into(im);
                break;
            case 2:
                Picasso.with(getContext()).load("https://drop.ndtv.com/albums/uploadedpics/small1/650_636289137540140536.jpg").fit().into(im);
                break;
            case 3:
                break;
        }

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (a){

                    case 0:
                        Glide.with(getContext()).load("http://i.ndtvimg.com/i/2016-10/vodafone_650x400_61477470270.jpg").bitmapTransform(new BlurTransformation(getContext(),20)).into(new SimpleTarget<GlideDrawable>() {
                            @Override
                            public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {

                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    rl.setBackground(resource);
                                }

                            }
                        });

                        break;


                    case 1:

                        Glide.with(getContext()).load("http://i.ndtvimg.com/i/2017-04/2017-maruti-suzuki-swift-dzire_827x510_41492771877.jpg").bitmapTransform(new BlurTransformation(getContext(),20)).into(new SimpleTarget<GlideDrawable>() {
                            @Override
                            public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {

                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    rl.setBackground(resource);
                                }

                            }
                        });

                        break;
                    case 2:

                        Glide.with(getContext()).load("https://drop.ndtv.com/albums/uploadedpics/small1/650_636289137540140536.jpg").bitmapTransform(new BlurTransformation(getContext(),20)).into(new SimpleTarget<GlideDrawable>() {
                            @Override
                            public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {

                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    rl.setBackground(resource);
                                }

                            }
                        });

                        break;
                    case 3:

                        Glide.with(getContext()).load("https://www.planwallpaper.com/static/images/sunset_scenery_nature_wallpaper_hd.jpg").bitmapTransform(new BlurTransformation(getContext(),100)).into(new SimpleTarget<GlideDrawable>() {
                            @Override
                            public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {

                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                                    rl.setBackground(resource);
                                }

                            }
                        });

                        break;


                }


            }
        });


        return v;
    }
}
