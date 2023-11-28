package com.hotel.api.web.service;

import java.util.List;

import com.hotel.api.web.model.Booking;

public interface BookingService {

	List<Booking> getAllBookings();

	Booking getBookingById(String bookingId);

	Booking bookRoom(Booking booking);

	void updateBookingStatus(String bookingId, String status);

	void deleteBooking(String bookingId);
}
