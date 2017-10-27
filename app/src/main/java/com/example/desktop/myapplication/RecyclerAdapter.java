package com.example.desktop.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Desktop on 10/27/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    String [] course_name,cousrse_desp;
    int [] bg;
    public  RecyclerAdapter (String[] course_name, String[] cousrse_desp, int [] bg) {
        this.course_name = course_name;
        this.cousrse_desp = cousrse_desp;
        this.bg=bg;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.cname.setText(course_name[position]);
        holder.cdesp.setText(cousrse_desp[position]);
        holder.img.setImageResource(bg[position]);

    }

    @Override
    public int getItemCount() {
        return course_name.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView cname,cdesp;
        ImageView img;
        public RecyclerViewHolder(View view) {
            super(view);
            cname=view.findViewById(R.id.textView);
            cdesp=view.findViewById(R.id.textView2);
            img = view.findViewById(R.id.imageView);

        }
    }
}
