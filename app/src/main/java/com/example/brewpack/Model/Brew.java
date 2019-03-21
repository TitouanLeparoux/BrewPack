package com.example.brewpack.Model;

public class Brew {
    private String name;
    private String brewery_type;
    private String street;
    private String city;
    private String state;
    private String postal_code;
    private String country;
    private double longitude;
    private double latitude;
    private int phone;
    private String website_url;
    private String updated_at;

    // GETTER
    public String getName()             { return name; }
    public String getBrewery_type()     { return brewery_type; }
    public String getStreet()           { return street; }
    public String getCity()             { return city; }
    public String getState()            { return state; }
    public String getPostal_code()      { return postal_code; }
    public String getCountry()          { return country; }
    public double getLongitude()        { return longitude; }
    public double getLatitude()         { return latitude; }
    public int getPhone()               { return phone; }
    public String getWebsite_url()      { return website_url; }
    public String getUpdated_at()       { return updated_at; }
}

