package com.hotel.api.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hotel.api.web.model.Room;
import com.hotel.api.web.model.RoomFactory;
import com.hotel.api.web.model.RoomServices;
import com.hotel.api.web.model.Rooms;
import com.hotel.api.web.repository.RoomRepository;

public class RoomServiceImpl implements RoomServices{
	 //@Autowired
	   // private RoomRepository roomRepository;

	    private final RoomFactory deluxeRoomFactory;
	    private final RoomFactory standardRoomFactory;

	    @Autowired
	    public RoomServiceImpl(RoomFactory deluxeRoomFactory, RoomFactory standardRoomFactory) {
	        this.deluxeRoomFactory = deluxeRoomFactory;
	        this.standardRoomFactory = standardRoomFactory;
	    }

//	    @Override
//	    public List<Rooms> getAllRooms() {
//	        return (List<Rooms>) roomRepository.findAll();
//	    }

	    @Override
	    public List<Rooms> getRoomsByType(String roomType) {
	        switch (roomType.toLowerCase()) {
	            case "deluxe":
	                return createRooms(deluxeRoomFactory);
	            case "standard":
	                return createRooms(standardRoomFactory);
	            default:
	                throw new IllegalArgumentException("Invalid room type: " + roomType);
	        }
	    }

	    private List<Rooms> createRooms(RoomFactory roomFactory) {
	        // Logic to create multiple rooms of the specified type
	        // You might need to modify this based on your application's needs
	        List<Rooms> rooms = new ArrayList<>();
	        for (int i = 0; i < 5; i++) {
	            rooms.add(roomFactory.createRoom());
	        }
	        return rooms;
	    }

		@Override
		public List<Rooms> getAllRooms() {
			// TODO Auto-generated method stub
			return null;
		}
}
