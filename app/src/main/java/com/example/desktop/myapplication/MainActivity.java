package com.example.desktop.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  RecyclerView.Adapter adapter;
    private  RecyclerView.LayoutManager layoutManager;
  public   String [] course ={"AI &amp EI","Augmented Reality","Big Data","Cloud Computing","Embedded System","Gaming Application Development","IoT","Mobile Application Development","Robotics","Web Development"};
   public String [] desp ={"desp","desp2","desp3","desp4"};
    int[] img = {R.drawable.ai, R.drawable.ar, R.drawable.big, R.drawable.cloud,R.drawable.embedded,R.drawable.gaming,R.drawable.iot,R.drawable.mobiledev,R.drawable.robo,R.drawable.webdev};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_layouts);
        recyclerView = findViewById(R.id.recycle);
        adapter = new RecyclerAdapter(course,desp,img,getApplicationContext());
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
//        final ViewFlipper MyViewFlipper = findViewById(R.id.viewflipper);
//        MyViewFlipper.setAutoStart(true);

    }
}
