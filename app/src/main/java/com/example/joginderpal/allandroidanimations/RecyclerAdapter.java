package com.example.joginderpal.allandroidanimations;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by joginderpal on 18-04-2017.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    String anim[]={"Floating Action Button","Animation 2","Animation 3","Animation 4","Animation 5","Animation 6","Animation 7"};


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


        }

    }


}
