package com.example.desktop.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Desktop on 10/24/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(Adapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(View view) {
            super(view);
        }
    }
}
