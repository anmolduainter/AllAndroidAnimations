package com.example.joginderpal.allandroidanimations;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import com.example.joginderpal.allandroidanimations.cool_navigation.coolNavMain;
import com.example.joginderpal.allandroidanimations.float_anim.float_activity;
import com.example.joginderpal.allandroidanimations.inshorts.inshorts_main;
import com.example.joginderpal.allandroidanimations.navigation_drawer.navigationMain;
import com.example.joginderpal.allandroidanimations.wynk.wynk_main;

/**
 * Created by joginderpal on 18-04-2017.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    int lastposition=-1;

    String anim[]={"Fabs","Inshorts","Wynk","Navigation Drawer","CoolNavigation","Animation 6","Animation 7"};

    Context ctx;

    MainActivity mainActivity;

    public RecyclerAdapter(Context ctx, MainActivity mainActivity) {

        this.ctx=ctx;
        this.mainActivity=mainActivity;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);

        RecyclerView.ViewHolder v=new ViewHolder(view);

        return (ViewHolder) v;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.tx.setText(anim[position]);

        if (position>lastposition) {
            TranslateAnimation translateAnimation = new TranslateAnimation(2000, 0, 0, 0);
            translateAnimation.setDuration(800 - position * 60);
            holder.itemView.startAnimation(translateAnimation);

            lastposition++;

        }


    }

    @Override
    public int getItemCount() {
        return anim.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView tx;

        public ViewHolder(View item){
            super(item);

            tx= (TextView) item.findViewById(R.id.tx);
            item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=getAdapterPosition();

                    if (anim[position].equals("Inshorts")){
                        Intent i=new Intent(ctx,inshorts_main.class);
                        ctx.startActivity(i);
                        mainActivity.overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                    }

                    else if (anim[position].equals("Fabs")){
                        Intent i=new Intent(ctx,float_activity.class);
                        ctx.startActivity(i);
                    }

                    else if (anim[position].equals("Wynk")){

                        Intent i=new Intent(ctx,wynk_main.class);
                        ctx.startActivity(i);
                        mainActivity.overridePendingTransition(R.anim.slide_up,R.anim.slide_up_activit);
                    }

                    else if (anim[position].equals("Navigation Drawer")){

                        Intent i=new Intent(ctx,navigationMain.class);
                        ctx.startActivity(i);

                    }

                    else if (anim[position].equals("CoolNavigation")){

                       Intent i=new Intent(ctx,coolNavMain.class);
                        ctx.startActivity(i);

                    }

                }
            });


        }

    }


}
