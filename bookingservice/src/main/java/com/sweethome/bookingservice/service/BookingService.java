package com.sweethome.bookingservice.service;

import java.util.Optional;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sweethome.bookingservice.dao.BookiningDao;
import com.sweethome.bookingservice.model.dto.BookingDto;
import com.sweethome.bookingservice.model.dto.PaymentDto;
import com.sweethome.bookingservice.model.dto.PaymentRequestDto;
import com.sweethome.bookingservice.model.entity.BookingInfoEntity;

@Service
public class BookingService {
	
	@Autowired
	public BookingService(BookiningDao bookingDao, RestTemplate restTemplate, Producer<String, String> producer) {
		this.bookingDao = bookingDao;
		this.restTemplate = restTemplate;
		this.producer = producer;
		
	}
	
	BookiningDao bookingDao;
	RestTemplate restTemplate;
	Producer<String, String> producer;
	
	@Value("${url.searvice.search}")
	private String searchServiceUrl;
	@Value("${url.searvice.payment}")
	private String paymentServiceUrl;
	
	public BookingInfoEntity  bookingDetails(BookingDto bookingRequest) {
		
		String url = searchServiceUrl + "/" +bookingRequest.getRoomCount();
		String roomNumbers = restTemplate.getForObject(url, String.class);
		BookingInfoEntity bookingInfo = bookingRequest.getBookingInfo();
		bookingInfo.setRoomNumbers(roomNumbers);
		return bookingDao.save(bookingInfo);
	}
	
	public BookingInfoEntity doPayment(int bookingId, PaymentDto paymentDetails) throws Exception {
		String trancationId;
		// call payment service and get paymentID to save in booking.
		
		
		Optional<BookingInfoEntity> bookingInfoOptional = bookingDao.findById(bookingId);
		if(bookingInfoOptional.isPresent()) {
			BookingInfoEntity bookingInfo = bookingInfoOptional.get();
			PaymentRequestDto paymentRequest = new PaymentRequestDto(bookingId, paymentDetails);
			trancationId = restTemplate.postForObject(paymentServiceUrl, paymentRequest, Integer.class).toString();
			bookingInfo.setTrancationId(trancationId);
			bookingDao.save(bookingInfo);
			String message = bookingInfo.getUserId()+", " +  bookingInfo.getTo()+", "+ bookingId;
			producer.send(new ProducerRecord<String, String>("messagge","message", message));
			return bookingInfo;
		}else {
			throw new Exception("No Booking Found for giving ID");
		}
	}

}
