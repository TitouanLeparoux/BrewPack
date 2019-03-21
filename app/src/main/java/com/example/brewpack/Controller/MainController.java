package com.example.brewpack.Controller;

import android.util.Log;

import com.example.brewpack.Model.Brew;
import com.example.brewpack.View.ListActivity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainController {

    private ListActivity activity;

    public MainController(ListActivity mainActivity) {
        this.activity = mainActivity;
    }

    public void onStart(){

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/Metasilveur/MobileFireEmblem/master/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();


        RespBrewAPI RespBrewAPI_var = retrofit.create(RespBrewAPI.class);

        Call<RestBrewResponse> call = RespBrewAPI_var.getListBreweries();

        call.enqueue(new Callback<RestBrewResponse>() {
            @Override
            public void onResponse(Call<RestBrewResponse> call,
                                   Response<RestBrewResponse> response) {
                RestBrewResponse restPokemonResponse = response.body();
                List<Brew> listPokemon = restPokemonResponse.getBreweries();
                activity.showList(listPokemon);
            }

            @Override
            public void onFailure(Call<RestBrewResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }

}
