package com.sweethome.bookingservice.model;

import java.util.Date;

public class BookingRequest {

	private String userId;
	private int hotelId;
	private Date fromDate;
	private Date toDate;
	private int roomCount;
	private RoomType roomType;
	
	
	public BookingRequest() {
	}



	public BookingRequest(String userId, int hotelId, Date fromDate, Date toDate, int roomCount, 
								RoomType roomType) {
		this.userId = userId;
		this.hotelId = hotelId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.roomCount = roomCount;
		this.roomType = roomType;
	}
	
	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
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

	public BookingInformation getBookingInfo() {
		return new BookingInformation(userId, hotelId, fromDate, toDate);
	}
}
