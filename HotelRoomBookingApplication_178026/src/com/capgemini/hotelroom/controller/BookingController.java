package com.capgemini.hotelroom.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.hotelroom.bean.BookingDetails;
import com.capgemini.hotelroom.bean.HotelDetails;
import com.capgemini.hotelroom.service.IBookingService;

@Controller
public class BookingController {

	@Autowired
	IBookingService service;

	public IBookingService getService() {
		return service;
	}

	public void setService(IBookingService service) {
		this.service = service;
	}

	/*
	 * Gives control to the HotelDetails.jsp page by adding the hotelDetails to the
	 * jsp page
	 */
	@RequestMapping(value = "/HotelDetailsPage")
	public String showHotelDetailsPage(Model model) {
		ArrayList<HotelDetails> hotelDetails = service.getHotelDetails();
		model.addAttribute("hotelDetails", hotelDetails);
		return "HotelDetails";
	}

	/*
	 * Gets control from HotelDetails.jsp page and opens the Booking page to get
	 * details of the customer
	 */
	@RequestMapping("/BookHotel")
	public String bookHotel(@RequestParam("id") int id, Model model) {
		BookingDetails bookingDetails = new BookingDetails();
		bookingDetails.setHotelid(id);
		model.addAttribute("bookingDetails", bookingDetails);
		return "HotelBooking";
	}

	/*
	 * Gets control from HotelBooking.jsp page and add customer to database and
	 * displays the customer id
	 */
	@RequestMapping("/ConfirmBookHotel")
	public String confirmBookHotel(@ModelAttribute BookingDetails bookingDetails, Model model) {
		int customerId = service.addBookingDetails(bookingDetails);
		model.addAttribute("customerId", customerId);
		String hotelName = null;
		if (bookingDetails.getHotelid() == 1) {
			hotelName = "Hilton Hotel";
		} else if (bookingDetails.getHotelid() == 2) {
			hotelName = "Vivanta by TAJ";
		} else if (bookingDetails.getHotelid() == 3) {
			hotelName = "New Ginger Resort";
		} else if (bookingDetails.getHotelid() == 4) {
			hotelName = "Hilton Hotel";
		}
		model.addAttribute("hotelName", hotelName);
		return "HotelBookingSuccessPage";
	}

}
