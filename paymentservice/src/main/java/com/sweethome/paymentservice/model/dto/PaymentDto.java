package com.sweethome.paymentservice.model.dto;

import com.sweethome.paymentservice.model.PaymentDetails;

public class PaymentDto {

	private int bookingId;
	private PaymentDetails paymentDetails;
	
	public PaymentDto() {
	}
	
	public PaymentDto(int bookingId, PaymentDetails paymentDetails) {
		this.bookingId = bookingId;
		this.paymentDetails = paymentDetails;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
	
}
