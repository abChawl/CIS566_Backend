package com.hotel.api.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.hotel.api.web.model.Booking;
import com.hotel.api.web.model.Room;
import com.hotel.api.web.model.Rooms;

public interface RoomRepository{// extends JpaRepository<Rooms, Long>{

	 List<Rooms> findByRoomType(String roomType);
}
