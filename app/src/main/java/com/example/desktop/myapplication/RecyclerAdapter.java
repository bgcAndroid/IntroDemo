package com.example.desktop.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
    Context context;
    public  RecyclerAdapter (String[] course_name, String[] cousrse_desp, int [] bg,Context context) {
        this.course_name = course_name;
        this.cousrse_desp = cousrse_desp;
        this.bg=bg;
        this.context=context;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view, context);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {
        final ImageAdapter imge = new ImageAdapter();
//        holder.cname.setText(course_name[position]);
        holder.cdesp.setText(course_name[position]);
        holder.img.setImageResource(bg[position]);
//        for (int i = 0; i <=bg.length ; i++) {
//            new Thread(new Runnable() {
//
//                public void run() {
//                    holder.img.setImageResource(bg[position]);
//                }
//            }).start();
//        }

            }


    @Override
    public int getItemCount() {
        return course_name.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView cname,cdesp;
        ImageView img,morei;
        Context context;
        public RecyclerViewHolder(View view,Context context) {
            super(view);
            this.context=context;
//            cname=view.findViewById(R.id.textView);
            cdesp=view.findViewById(R.id.textView2);
            img = view.findViewById(R.id.imageView);
            morei = view.findViewById(R.id.morei);


            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Log.i("position","position"+getAdapterPosition()+"is");
            String pos = String.valueOf(getAdapterPosition());
            Intent i = new Intent(this.context,LangActivity.class);
            i.putExtra("course",pos);
            context.startActivity(i);

        }
    }
}
