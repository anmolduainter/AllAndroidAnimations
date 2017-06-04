package com.example.joginderpal.allandroidanimations.Arc;

import android.animation.Animator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ViewAnimator;

import com.example.joginderpal.allandroidanimations.R;

/**
 * Created by joginderpal on 14-05-2017.
 */
public class arc_main_two extends AppCompatActivity {

    FloatingActionButton fab;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arc_main_two);
        fab= (FloatingActionButton) findViewById(R.id.fab_arc_main_two);
        fab.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                AnimationSet animationSet=new AnimationSet(true);
                final ScaleAnimation scaleAnimation=new ScaleAnimation(1,0,1,0,fab.getPivotX(),fab.getPivotY());
                scaleAnimation.setDuration(200);
                animationSet.addAnimation(scaleAnimation);
                fab.startAnimation(animationSet);
                animationSet.setFillAfter(true);
                final View DialogView=View.inflate(arc_main_two.this,R.layout.arc_main_two_dialog_login,null);
                final Dialog dialog=new Dialog(arc_main_two.this,R.style.ArcMainTwoDialog);
                dialog.setContentView(DialogView);
                dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(DialogInterface dialog1) {

                        double a=DialogView.getWidth();
                        double b=DialogView.getHeight();
                        int cx= (int) (DialogView.getX()+DialogView.getWidth());
                        int cy= (int) (DialogView.getY()+DialogView.getHeight());
                        Animator anim=ViewAnimationUtils.createCircularReveal(DialogView,cx,cy,0, (float) Math.hypot(a,b));
                        anim.setDuration(500);
                        anim.start();


                    }
                });

                dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
                    @Override
                    public boolean onKey(final DialogInterface dialog, int keyCode, KeyEvent event) {

                        if (keyCode==event.KEYCODE_BACK){

                            double a=DialogView.getWidth();
                            double b=DialogView.getHeight();
                            int cx1= 0;
                            int cy1= 0;
                            Animator anim=ViewAnimationUtils.createCircularReveal(DialogView,cx1,cy1,(float) Math.hypot(a,b),0);
                            anim.setDuration(500);
                            anim.start();
                            anim.addListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    dialog.dismiss();
                                    ScaleAnimation scaleAnimation1=new ScaleAnimation(0,1,0,1,fab.getPivotX(),fab.getPivotY());
                                    scaleAnimation1.setDuration(200);
                                    scaleAnimation1.setFillAfter(true);
                                    fab.startAnimation(scaleAnimation1);
                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            });

                            return true;

                        }
                        return false;
                    }
                });

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                dialog.show();

            }
        });

    }
}
