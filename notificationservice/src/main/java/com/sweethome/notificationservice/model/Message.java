package com.sweethome.notificationservice.model;

import java.util.Date;

public class Message {
	private int bookingId;
	private int userId;
	private Date toDate;
	
	public Message() {
		super();
	}
	public Message(int bookingId, int userId, Date toDate) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.toDate = toDate;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	

}
