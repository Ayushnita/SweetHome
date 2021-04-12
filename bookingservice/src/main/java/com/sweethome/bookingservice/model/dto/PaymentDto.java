package com.sweethome.bookingservice.model.dto;

import java.util.Date;

public class PaymentDto {
	
	private String bookingMode;
	private Date bookingDate;
	private float amount;
	private String upiId;
	private String cardNumber;
	
	public String getBookingMode() {
		return bookingMode;
	}
	public void setBookingMode(String bookingMode) {
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
