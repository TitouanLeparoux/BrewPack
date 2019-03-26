package com.example.brewpack.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.brewpack.Model.Brew;
import com.example.brewpack.R;
import com.google.gson.Gson;

public class ContentActivity extends AppCompatActivity {

    private static final String NAME = "showTextView";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        String json = getIntent().getStringExtra(NAME);
        Gson gson = new Gson();
        Brew brew = gson.fromJson(json, Brew.class);

        TextView name = findViewById(R.id.nameBrew);
        name.setText(brew.getName());
    }
}
