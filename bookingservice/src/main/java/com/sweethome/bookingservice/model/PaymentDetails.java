package com.sweethome.bookingservice.model;

import java.util.Date;

public class PaymentDetails {
	
	private BookingMode bookingMode;
	private Date bookingDate;
	private float amount;
	private String upiId;
	private String cardNumber;
	
	public BookingMode getBookingMode() {
		return bookingMode;
	}
	public void setBookingMode(BookingMode bookingMode) {
		this.bookingMode = bookingMode;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

}
