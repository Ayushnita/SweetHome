package com.sweethome.bookingservice.model.dto;

import java.util.Date;

import com.sweethome.bookingservice.model.entity.BookingInfoEntity;

public class BookingDto {

	private String userId;
	private int hotelId;
	private Date fromDate;
	private Date toDate;
	private int roomCount;
	private String roomType;
	
	
	public BookingDto() {
	}



	public BookingDto(String userId, int hotelId, Date fromDate, Date toDate, int roomCount, 
								String roomType) {
		this.userId = userId;
		this.hotelId = hotelId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.roomCount = roomCount;
		this.roomType = roomType;
	}
	
	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
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

	public BookingInfoEntity getBookingInfo() {
		return new BookingInfoEntity(userId, hotelId, fromDate, toDate);
	}
}
