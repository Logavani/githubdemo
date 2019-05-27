package com.capgemini.hotelroom.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
// this bean is used to collect the customer values and add to database
public class BookingDetails {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 30)
	private String customername;
	@Column
	private int hotelid;
	@Column
	private Date todate;
	@Column
	private Date fromdate;
	@Column
	private int noofrooms;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getHotelid() {
		return hotelid;
	}

	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	public Date getFromdate() {
		return fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public int getNoofrooms() {
		return noofrooms;
	}

	public void setNoofrooms(int noofrooms) {
		this.noofrooms = noofrooms;
	}

	@Override
	public String toString() {
		return "BookingDetails [id=" + id + ", customername=" + customername + ", hotelid=" + hotelid + ", todate="
				+ todate + ", fromdate=" + fromdate + ", noofrooms=" + noofrooms + "]";
	}

}
