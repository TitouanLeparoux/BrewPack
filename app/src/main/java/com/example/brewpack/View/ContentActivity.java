package com.example.brewpack.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
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

        // NAME
        TextView name = findViewById(R.id.nameBrew);
        name.setText(brew.getName());

        // TYPE
        TextView type = findViewById(R.id.typeBrew);
        type.setText("Type : " + brew.getBrewery_type());

        // PLACE
        TextView city = findViewById(R.id.cityBrew);
        city.setText("Place : " + brew.getCity()+ ", " + brew.getCountry());

        // WEBSITE URL
        TextView url = findViewById(R.id.urlBrew);
        url.setText("WebSite : " + brew.getWebsite_url());

        // POSITION with maps
        TextView position = findViewById(R.id.positionBrew);
        position.setClickable(true);
        position.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "https://www.google.com/maps?q=" +
                brew.getLatitude() + "," +
                brew.getLongitude() ;
        position.setText("Position : " + text);
    }
}
