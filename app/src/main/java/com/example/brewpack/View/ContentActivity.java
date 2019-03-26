package com.example.brewpack.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.brewpack.R;

public class ContentActivity extends AppCompatActivity {

    private static final String NAME = "showTextView";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
    }
}
