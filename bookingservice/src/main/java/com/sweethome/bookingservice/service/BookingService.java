package com.sweethome.bookingservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sweethome.bookingservice.dao.BookiningDao;
import com.sweethome.bookingservice.model.BookingInformation;
import com.sweethome.bookingservice.model.BookingRequest;
import com.sweethome.bookingservice.model.PaymentDetails;
import com.sweethome.bookingservice.model.PaymentRequest;

@Service
public class BookingService {
	
	@Autowired
	public BookingService(BookiningDao bookingDao, RestTemplate restTemplate) {
		this.bookingDao = bookingDao;
		this.restTemplate = restTemplate;
	}
	
	BookiningDao bookingDao;
	RestTemplate restTemplate;
	
	public BookingInformation  bookingDetails(BookingRequest bookingRequest) {
		String baseUrl = "http://search-service/search";
		String url = baseUrl + "/" +bookingRequest.getRoomCount();
		String roomNumbers = restTemplate.getForObject(url, String.class);
		BookingInformation bookingInfo = bookingRequest.getBookingInfo();
		bookingInfo.setRoomNumbers(roomNumbers);
		return bookingDao.save(bookingInfo);
	}
	
	public BookingInformation doPayment(int bookingId, PaymentDetails paymentDetails) throws Exception {
		String trancationId;
		// call payment service and get paymentID to save in booking.
		
		String paymentUrl = "http://payment-service/payment";
		
		Optional<BookingInformation> bookingInfoOptional = bookingDao.findById(bookingId);
		if(bookingInfoOptional.isPresent()) {
			BookingInformation bookingInfo = bookingInfoOptional.get();
			PaymentRequest paymentRequest = new PaymentRequest(bookingId, paymentDetails);
			trancationId = restTemplate.postForObject(paymentUrl, paymentRequest, Integer.class).toString();
			bookingInfo.setTrancationId(trancationId);
			bookingDao.save(bookingInfo);
			
			
			return bookingInfo;
		}else {
			throw new Exception("No Booking Found for giving ID");
		}
	}

}
