package com.example.desktop.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;

public class ScrollingActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private  RecyclerView.Adapter adapter;
    private  RecyclerView.LayoutManager layoutManager;
    public   String [] course ={"AI &amp EI","Augmented Reality","Big Data","Cloud Computing","Embedded System","Gaming Application Development","IoT","Mobile Application Development","Robotics","Web Development"};
    public String [] desp ={"desp","desp2","desp3","desp4"};
    int[] img = {R.drawable.ai, R.drawable.ar, R.drawable.big, R.drawable.cloud,R.drawable.embedded,R.drawable.gaming,R.drawable.iot,R.drawable.mobiledev,R.drawable.robo,R.drawable.webdev};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/**
 * Prevent from taking Screenshots
 */
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE);

        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.toolbar_layout);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        //get the bitmap of the drawable image we are using as background
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ai);
        //using palette, change the color of collapsing toolbar layout
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
                                          public void onGenerated(Palette palette) {
                                              int mutedColor = palette.getMutedColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                                              int mutedDarkColor = palette.getDarkMutedColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark));
                                              int vibrantColor = palette.getVibrantColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                                              collapsingToolbarLayout.setContentScrimColor(mutedColor);
                                              collapsingToolbarLayout.setStatusBarScrimColor(mutedDarkColor);

                                          }
                                      });


        adapter = new RecyclerAdapter(course,desp,img,getApplicationContext());
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(ScrollingActivity.this);
        layoutManager.canScrollVertically();
        recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
    }

}
