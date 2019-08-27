package com.gvp.it.doit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.github.barteksc.pdfviewer.PDFView;
import android.support.v7.widget.Toolbar;

public class Faculty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Faculty");

        PDFView pdv = findViewById(R.id.pdv);
        pdv.fromAsset("__ Welcome to Gayatri Vidya Parishad College of Engineering (Autonomous) __.pdf")
                .load();

    }

}

