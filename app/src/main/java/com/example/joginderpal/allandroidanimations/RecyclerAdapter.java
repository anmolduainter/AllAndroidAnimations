package com.example.joginderpal.allandroidanimations;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.joginderpal.allandroidanimations.float_anim.float_activity;
import com.example.joginderpal.allandroidanimations.inshorts.inshorts_main;
import com.example.joginderpal.allandroidanimations.wynk.wynk_main;

/**
 * Created by joginderpal on 18-04-2017.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    String anim[]={"Fabs","Inshorts","Wynk","Animation 4","Animation 5","Animation 6","Animation 7"};

    Context ctx;

    public RecyclerAdapter(Context ctx) {

        this.ctx=ctx;

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
                    }

                    else if (anim[position].equals("Fabs")){
                        Intent i=new Intent(ctx,float_activity.class);
                        ctx.startActivity(i);
                    }

                    else if (anim[position].equals("Wynk")){

                        Intent i=new Intent(ctx,wynk_main.class);
                        ctx.startActivity(i);

                    }



                }
            });


        }

    }


}
