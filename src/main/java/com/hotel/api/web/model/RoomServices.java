package com.hotel.api.web.model;

import java.util.List;

public interface RoomServices {
	 List<Rooms> getAllRooms();
	    List<Rooms> getRoomsByType(String roomType);
}
