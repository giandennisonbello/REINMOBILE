package com.example.lorrainegarcia.rein.model;

public class location {

    private Double Lat;
    private Double Lon;


    public Double getLat() {
        return Lat;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public Double getLon() {
        return Lon;
    }

    public void setLon(Double lon) {
        Lon = lon;
    }

    public location(Double lat, Double lon) {
        Lat = lat;
        Lon = lon;
    }
}
