package com.sweethome.bookingservice.model.dto;

public class PaymentRequestDto {
	
	private int bookingId;
	private PaymentDto paymentDetails;
	
	public PaymentRequestDto() {
	}
	
	public PaymentRequestDto(int bookingId, PaymentDto paymentDetails) {
		this.bookingId = bookingId;
		this.paymentDetails = paymentDetails;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public PaymentDto getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(PaymentDto paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

}
