package com.sweethome.bookingservice.model;

import java.util.Date;

public class Message {
	
	private String userId;
	private Date toDate;
	private int bookingId;
	public Message(String userId, Date toDate, int bookingId) {
		super();
		this.userId = userId;
		this.toDate = toDate;
		this.bookingId = bookingId;
	}
	
	
	public Message() {
		super();
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

}
