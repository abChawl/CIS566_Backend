package com.hotel.api.web.model;

public class FridgeAmenity implements Amenity {
    @Override
    public String getDescription() {
        return "Fridge";
    }

    @Override
    public int getCost() {
        return 15; 
    }
}
