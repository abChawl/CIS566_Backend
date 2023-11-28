package com.hotel.api.web.model;

import java.util.List;

public class Room {
	
	private String id;
	private List<Long> bookedDates;
    public String roomType;
    public String roomName;
    public String detail;
    public String amenities;
    public double price;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

	public Room(String id, List<Long> bookedDates, String roomType, String roomName, String detail, String amenities,
			double price) {
		super();
		this.id = id;
		this.bookedDates = bookedDates;
		this.roomType = roomType;
		this.roomName = roomName;
		this.detail = detail;
		this.amenities = amenities;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Long> getBookedDates() {
		return bookedDates;
	}

	public void setBookedDates(List<Long> bookedDates) {
		this.bookedDates = bookedDates;
	}


    
    
}
