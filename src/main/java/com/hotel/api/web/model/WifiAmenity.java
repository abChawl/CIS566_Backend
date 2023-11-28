package com.hotel.api.web.model;

public class WifiAmenity implements Amenity {
    @Override
    public String getDescription() {
        return "Wifi";
    }

    @Override
    public int getCost() {
        return 10; 
    }

}
