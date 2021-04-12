package com.sweethome.bookingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sweethome.bookingservice.config.JwtUtil;
import com.sweethome.bookingservice.model.dto.BookingDto;
import com.sweethome.bookingservice.model.dto.PaymentDto;
import com.sweethome.bookingservice.model.entity.BookingInfoEntity;
import com.sweethome.bookingservice.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	BookingService bookingService;
	
	@PostMapping("/booking")
	public ResponseEntity<BookingInfoEntity> bookingDetails(@RequestBody BookingDto bookingRequest, @RequestHeader("Authorization") String jwtToken) throws Exception {
		JwtUtil.validateToken(jwtToken);
		BookingInfoEntity bookingInfo =  this.bookingService.bookingDetails(bookingRequest);
		return new ResponseEntity<BookingInfoEntity>(bookingInfo, HttpStatus.CREATED);
	}
	
	
	@PostMapping("/booking/payment/{bookingId}")
	public ResponseEntity<BookingInfoEntity> doPayment(@PathVariable int bookingId, @RequestBody PaymentDto paymentDetails, 
			@RequestHeader("Authorization") String jwtToken) throws Exception {
		JwtUtil.validateToken(jwtToken);
		BookingInfoEntity bookingInfo =  bookingService.doPayment(bookingId, paymentDetails);
		return new ResponseEntity<BookingInfoEntity>(bookingInfo, HttpStatus.CREATED);
	}
	
}
