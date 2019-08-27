package com.gvp.it.doit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.support.v7.widget.Toolbar;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("GVP Website");

        String url="http://www.gvpce.ac.in/";

        WebView wv=new WebView(this);
        setContentView(wv);
        wv.loadUrl(url);
    }
}