package com.sweethome.serchservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table(name = "booking_details")
public class RoomBookingDetails {

	@Id
	private int bookingId;
	private String roomIds;
	
	@Temporal(TemporalType.DATE)
	private Date fromDate;
	@Temporal(TemporalType.DATE)
	private Date toDate;
	private String userName;
	private int paymentId;
	
	
	public RoomBookingDetails(int bookingId, String roomId, Date fromDate, Date toDate, String userName,
			String adharNumber, int paymentId) {
		super();
		this.bookingId = bookingId;
		this.roomIds = roomId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.userName = userName;
		this.paymentId = paymentId;
	}


	public RoomBookingDetails() {
		super();
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getFromDate() {
		return fromDate;
	}


	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}


	public Date getToDate() {
		return toDate;
	}


	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}


	public String getRoomIds() {
		return roomIds;
	}


	public void setRoomIds(String roomIds) {
		this.roomIds = roomIds;
	}
	
	
	
}
