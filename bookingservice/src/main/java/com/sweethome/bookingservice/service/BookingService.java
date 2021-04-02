package com.sweethome.bookingservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sweethome.bookingservice.dao.BookiningDao;
import com.sweethome.bookingservice.model.BookingInformation;
import com.sweethome.bookingservice.model.BookingRequest;
import com.sweethome.bookingservice.model.PaymentDetails;

@Service
public class BookingService {
	
	public BookingService(BookiningDao bookingDao) {
		this.bookingDao = bookingDao;
	}
	
	BookiningDao bookingDao;
	
	public BookingInformation  bookingDetails(BookingRequest bookingRequest) {
		String roomNumbers = "1, 2, 3";
		BookingInformation bookingInfo = bookingRequest.getBookingInfo();
		bookingInfo.setRoomNumbers(roomNumbers);
		return bookingDao.save(bookingInfo);
	}
	
	public BookingInformation doPayment(int bookingId, PaymentDetails paymentDetail) throws Exception {
		String trancationId = "123456";
		// call payment service and get paymentID to save in booking.
		

		
		Optional<BookingInformation> bookingInfoOptional = bookingDao.findById(bookingId);
		if(bookingInfoOptional.isPresent()) {
			BookingInformation bookingInfo = bookingInfoOptional.get();
			
			bookingInfo.setTrancationId(trancationId);
			bookingDao.save(bookingInfo);
			
			
			return bookingInfo;
		}else {
			throw new Exception("No Booking Found for giving ID");
		}
	}

}
