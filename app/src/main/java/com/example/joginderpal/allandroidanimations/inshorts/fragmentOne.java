package com.example.joginderpal.allandroidanimations.inshorts;

import android.annotation.SuppressLint;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.example.joginderpal.allandroidanimations.R;

import jp.wasabeef.glide.transformations.BlurTransformation;

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

        i=i%3;

        View v=inflater.inflate(R.layout.fragment_one,container,false);
        ImageView im= (ImageView) v.findViewById(R.id.image_inshorts);
        final RelativeLayout im2= (RelativeLayout) v.findViewById(R.id.article);
        final Window w=getActivity().getWindow();
        final RelativeLayout im1= (RelativeLayout) v.findViewById(R.id.rv);
        TextView tx= (TextView) v.findViewById(R.id.text_content);
        switch(i){

            case 0:
                Glide.with(getContext()).load("http://timesofindia.indiatimes.com/thumb/msid-58340478,width-400,resizemode-4/58340478.jpg").bitmapTransform(new BlurTransformation(getContext(),60)).into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {

                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                            im1.setBackground(resource);
                        }

                    }
                });
                Glide.with(getContext()).load("http://timesofindia.indiatimes.com/thumb/msid-58340478,width-400,resizemode-4/58340478.jpg").into(im);
                Glide.with(getContext()).load("http://timesofindia.indiatimes.com/thumb/msid-58340478,width-400,resizemode-4/58340478.jpg").bitmapTransform(new BlurTransformation(getContext(),100)).into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                            im2.setBackground(resource);
                        }
                    }
                });
                tx.setText("Even before completing his first year in office, the Kerala chief minister Pinarayi Vijayan had to drop two of his senior ministers and is now on the verge of losing a third one; but the order of the Supreme Court on Monday asking him to reinstate a ...");

                break;


            case 1:

                Glide.with(getContext()).load("http://i.ndtvimg.com/i/2017-04/2017-maruti-suzuki-swift-dzire_827x510_41492771877.jpg").bitmapTransform(new BlurTransformation(getContext(),60)).into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {

                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                            im1.setBackground(resource);
                        }

                    }
                });
                Glide.with(getContext()).load("http://i.ndtvimg.com/i/2017-04/2017-maruti-suzuki-swift-dzire_827x510_41492771877.jpg").into(im);
                Glide.with(getContext()).load("http://i.ndtvimg.com/i/2017-04/2017-maruti-suzuki-swift-dzire_827x510_41492771877.jpg").bitmapTransform(new BlurTransformation(getContext(),100)).into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                            im2.setBackground(resource);
                        }
                    }
                });
                tx.setText("The Maruti Suzuki Swift Dzire will be powered by the company's tried and tested 1.3-litre DDIS diesel engine that now gets the company's 'Smart Hybrid Vehicle from Suzuki' a.k.a. SHVS, making it a mild hybrid like the Maruti Suzuki Ciaz. On the other hand, the petrol variants will get the popular 1.2-litre K-Series engine. Both the engines will get a 5-speed manual gearbox as standard along with an AMT for the diesel and a 4-speed auto box for the petrol variant as an option. Power figures are expected to remain unchanged....");

                break;

            case 2:

                Glide.with(getContext()).load("http://i.ndtvimg.com/i/2016-10/vodafone_650x400_61477470270.jpg").bitmapTransform(new BlurTransformation(getContext(),60)).into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {

                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                            im1.setBackground(resource);
                        }

                    }
                });
                Glide.with(getContext()).load("http://i.ndtvimg.com/i/2016-10/vodafone_650x400_61477470270.jpg").into(im);
                Glide.with(getContext()).load("http://i.ndtvimg.com/i/2016-10/vodafone_650x400_61477470270.jpg").bitmapTransform(new BlurTransformation(getContext(),100)).into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                            im2.setBackground(resource);
                        }
                    }
                });
                tx.setText("Vodafone has announced an unlimited international roaming offer for travellers to the US, the UAE and Singapore. As part of its international roaming pack Vodafone i-RoamFREE, Vodafone India is offering unlimited calls and high-speed data for international travellers in packs priced from Rs. 500 for 24 hours. \"Believe it or not, you can make unlimited calls anywhere in the world and use unlimited high speed data while travelling in USA, UAE and Singapore... ");

                break;

        }
        return v;
    }
}
