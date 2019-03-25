package com.example.brewpack.Controller;

import com.example.brewpack.Model.Brew;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RespBrewAPI {

    @GET("breweries.json")
    Call<RestBrewResponse> getListBreweries();
}