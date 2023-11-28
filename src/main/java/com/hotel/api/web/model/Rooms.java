package com.hotel.api.web.model;

import java.util.List;

import jakarta.persistence.Entity;

public interface Rooms {

	String getId();
    List<Long> getBookedDates();
    String getName();
    String getDetail();
    List<String> getAmenities();
    int getPrice();
    
}
