package com.hotel.api.web.model;

public class DeluxeRoomFactory implements RoomFactory{

	@Override
    public Rooms createRoom() {
        return new DeluxeRoom();
    }
}
