package com.capgemini.hotelroom.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.hotelroom.bean.BookingDetails;
import com.capgemini.hotelroom.bean.HotelDetails;
import com.capgemini.hotelroom.dao.IBookingDAO;

@Service
public class BookingServiceImpl implements IBookingService {
	@Autowired
	IBookingDAO dao;

	public IBookingDAO getDao() {
		return dao;
	}

	public void setDao(IBookingDAO dao) {
		this.dao = dao;
	}

	// returns the Hotel Details to display in the jsp page
	@Override
	public ArrayList<HotelDetails> getHotelDetails() {
		return dao.getHotelDetails();
	}

	// Adds the customer to the database and returns the customer id
	@Override
	public int addBookingDetails(BookingDetails bookingDetails) {
		return dao.addBookingDetails(bookingDetails);
	}

}
