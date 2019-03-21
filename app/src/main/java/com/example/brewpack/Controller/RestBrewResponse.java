package com.example.brewpack.Controller;

import com.example.brewpack.Model.Brew;

import java.util.List;

public class RestBrewResponse {
    private List<Brew> breweries;

    // GETTER
    public List<Brew> getBreweries() {
        return breweries;
    }
}
