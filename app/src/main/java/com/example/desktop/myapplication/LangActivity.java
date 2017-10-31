package com.example.desktop.myapplication;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class LangActivity extends AppCompatActivity {
WebView mwebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bigdata);
        getSupportActionBar().setTitle("Languages you Need to Know");
        TextView lang = findViewById(R.id.clang);
        Intent i = getIntent();
   String course = i.getStringExtra("course");
        Log.i("position", i.getStringExtra("course"));
        int ic = Integer.parseInt(i.getStringExtra("course"));
        Resources res = getResources();
        String[] myBooks = res.getStringArray(R.array.course_name);
//        lang.setText(myBooks[ic]);
        mwebview =(WebView)findViewById(R.id.webview);
        mwebview.loadUrl("file:///android_asset/"+myBooks[ic]+".html");

    }

    public void signup(View view) {
        startActivity(new Intent(LangActivity.this,signUpActivity.class));
    }
}
