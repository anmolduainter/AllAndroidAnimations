package com.example.joginderpal.allandroidanimations.navigation_drawer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.joginderpal.allandroidanimations.R;

import java.util.zip.Inflater;

/**
 * Created by joginderpal on 30-04-2017.
 */
public class RecyclerAdapterNavigation extends RecyclerView.Adapter<RecyclerAdapterNavigation.ViewHolder> {



  class ViewHolder extends RecyclerView.ViewHolder{

      public ViewHolder(View itemView) {
          super(itemView);
      }
  }


    @Override
    public RecyclerAdapterNavigation.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_navigation,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerAdapterNavigation.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
