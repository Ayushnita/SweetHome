package com.sweethome.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sweethome.paymentservice.model.PaymentDetailsEntity;
import com.sweethome.paymentservice.model.PaymentRequest;
import com.sweethome.paymentservice.service.PaymentService;

@RestController
public class PaymentController {

	PaymentService paymentService;

	@Autowired
	public PaymentController(PaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}
	
	
	@PostMapping("/payment")
	@ResponseStatus(code = HttpStatus.CREATED)
	public int makePayment(@RequestBody PaymentRequest paymentRequest) {
		return this.paymentService.makePayment(paymentRequest.getBookingId(), 
												paymentRequest.getPaymentDetails());
	}
	
	
	@GetMapping("/payment/{paymentId}")
	public PaymentDetailsEntity getPaymentById(@PathVariable int paymentId) throws Exception {
		return this.paymentService.getPaymentById(paymentId);
	}
}
