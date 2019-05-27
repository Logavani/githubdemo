package com.capgemini.hotelroom.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.hotelroom.bean.BookingDetails;
import com.capgemini.hotelroom.bean.HotelDetails;

@Repository
@Transactional
public class BookingDAOImpl implements IBookingDAO {
	@PersistenceContext
	EntityManager manager;

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	// returns the Hotel Details to display in the jsp page
	@Override
	public ArrayList<HotelDetails> getHotelDetails() {
		ArrayList<HotelDetails> list = (ArrayList<HotelDetails>) manager
				.createQuery("Select hotels from HotelDetails hotels", HotelDetails.class).getResultList();
		return list;
	}

	//	Adds the customer to the database and returns the customer id
	@Override
	public int addBookingDetails(BookingDetails bookingDetails) {
		manager.persist(bookingDetails);
		return bookingDetails.getId();
	}

}
