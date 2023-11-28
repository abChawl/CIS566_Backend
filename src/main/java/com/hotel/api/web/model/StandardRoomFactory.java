package com.hotel.api.web.model;

public class StandardRoomFactory implements RoomFactory {
	@Override
    public Rooms createRoom() {
        return new StandardRoom();
    }
}
