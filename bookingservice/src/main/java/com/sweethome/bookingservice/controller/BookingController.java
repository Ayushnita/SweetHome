package com.sweethome.bookingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sweethome.bookingservice.model.BookingInformation;
import com.sweethome.bookingservice.model.BookingRequest;
import com.sweethome.bookingservice.model.PaymentDetails;
import com.sweethome.bookingservice.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	BookingService bookingService;
	
	@PostMapping("/booking")
	@ResponseStatus(code = HttpStatus.CREATED)
	public BookingInformation bookingDetails(@RequestBody BookingRequest bookingRequest) {
		return this.bookingService.bookingDetails(bookingRequest);
	}
	
	
	@PostMapping("/booking/payment/{bookingId}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public BookingInformation doPayment(@PathVariable int BookingId, @RequestBody PaymentDetails paymentDetails) throws Exception {
		return bookingService.doPayment(BookingId, paymentDetails);
	}
	
}
