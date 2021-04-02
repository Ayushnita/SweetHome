package com.sweethome.bookingservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;



@Table(name = "hotel_booking")
@Entity
public class BookingInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userId;
	private int HotelId;
	@Temporal(value = TemporalType.DATE)
	private Date fromDate;
	@Temporal(value = TemporalType.DATE)
	private Date to_date;
	private String roomNumbers;
	private String trancationId;
	@Temporal(TemporalType.DATE)
	@CreatedDate
	private Date bookedOn;
	
	
	
	
	public BookingInformation() {
	}


	public BookingInformation(String userId, int hotelId, Date fromDate, Date to) {
		this.userId = userId;
		HotelId = hotelId;
		this.fromDate = fromDate;
		this.to_date = to;
	}
	
	
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getTo() {
		return to_date;
	}
	public void setTo(Date to) {
		this.to_date = to;
	}
	public String getTrancationId() {
		return trancationId;
	}
	public void setTrancationId(String trancationId) {
		this.trancationId = trancationId;
	}
	public Date getBookedOn() {
		return bookedOn;
	}
	public void setBookedOn(Date bookedOn) {
		this.bookedOn = bookedOn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getHotelId() {
		return HotelId;
	}
	public void setHotelId(int hotelId) {
		HotelId = hotelId;
	}
	public Date getFrom() {
		return fromDate;
	}
	public void setFrom(Date from) {
		this.fromDate = from;
	}

	public String getRoomNumbers() {
		return roomNumbers;
	}
	public void setRoomNumbers(String roomNumbers) {
		this.roomNumbers = roomNumbers;
	}
	
}
