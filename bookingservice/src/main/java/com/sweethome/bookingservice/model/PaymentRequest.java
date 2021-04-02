package com.sweethome.bookingservice.model;

public class PaymentRequest {
	
	private int bookingId;
	private PaymentDetails paymentDetails;
	
	public PaymentRequest() {
	}
	
	public PaymentRequest(int bookingId, PaymentDetails paymentDetails) {
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
