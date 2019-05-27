package com.capgemini.hotelroom.service;

import java.util.ArrayList;

import com.capgemini.hotelroom.bean.BookingDetails;
import com.capgemini.hotelroom.bean.HotelDetails;

public interface IBookingService {

	public ArrayList<HotelDetails> getHotelDetails();

	public int addBookingDetails(BookingDetails bookingDetails);

}
