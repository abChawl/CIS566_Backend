package com.hotel.api.web.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DeluxeRoom implements Rooms{
	@Id
	  private String id;
	    private List<Long> bookedDates;
	    private String name;
	    private String detail;
	    private List<String> amenities;
	    private int basePrice;

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Long> getBookedDates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAmenities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
