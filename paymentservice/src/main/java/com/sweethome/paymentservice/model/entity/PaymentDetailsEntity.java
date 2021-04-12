package com.sweethome.paymentservice.model.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sweethome.paymentservice.model.PaymentDetails;


@Entity
@Table(name="payment")
public class PaymentDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String bookingMode;
	private Date bookingDate;
	private int  bookingId;
	private float amount;
	private String upiId;
	private String cardNumber;
	
	public PaymentDetailsEntity() {}
	
	public PaymentDetailsEntity(int bookingId, PaymentDetails paymentDetail) {
		this.bookingId = bookingId;
		this.bookingMode = paymentDetail.getBookingMode();
		this.bookingDate = paymentDetail.getBookingDate();
		this.amount = paymentDetail.getAmount();
		this.upiId = paymentDetail.getUpiId();
		this.cardNumber = paymentDetail.getCardNumber();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
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
