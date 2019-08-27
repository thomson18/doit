package com.gvp.it.doit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.support.v7.widget.Toolbar;

public class Academics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Academics");

        String url="http://www.gvpce.ac.in/itbtechcoustu15-16.html";

        WebView wv=new WebView(this);
        setContentView(wv);
        wv.loadUrl(url);
    }
}