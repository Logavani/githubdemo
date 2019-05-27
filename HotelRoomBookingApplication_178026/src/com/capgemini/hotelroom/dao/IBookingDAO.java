package com.capgemini.hotelroom.dao;

import java.util.ArrayList;

import com.capgemini.hotelroom.bean.BookingDetails;
import com.capgemini.hotelroom.bean.HotelDetails;

public interface IBookingDAO {

	public ArrayList<HotelDetails> getHotelDetails();

	public int addBookingDetails(BookingDetails bookingDetails);
	
}
