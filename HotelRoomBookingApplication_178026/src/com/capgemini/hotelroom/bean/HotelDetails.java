package com.capgemini.hotelroom.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class HotelDetails {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String rating;
	@Column
	private int rate;
	@Column
	private int availablerooms;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getAvailablerooms() {
		return availablerooms;
	}

	public void setAvailablerooms(int availablerooms) {
		this.availablerooms = availablerooms;
	}

	@Override
	public String toString() {
		return "BookingDetails [id=" + id + ", name=" + name + ", rating=" + rating + ", rate=" + rate
				+ ", availablerooms=" + availablerooms + "]";
	}
}
