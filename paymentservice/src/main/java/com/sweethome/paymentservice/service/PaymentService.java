package com.sweethome.paymentservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sweethome.paymentservice.dao.PaymentDetailDao;
import com.sweethome.paymentservice.model.PaymentDetails;
import com.sweethome.paymentservice.model.entity.PaymentDetailsEntity;


@Service
public class PaymentService {

	PaymentDetailDao paymentDetailDao;

	@Autowired
	public PaymentService(PaymentDetailDao paymentDetailDao) {
		super();
		this.paymentDetailDao = paymentDetailDao;
	}
	
	
	public int  makePayment(int bookingId, PaymentDetails paymentDetail) {
		PaymentDetailsEntity paymentDetailsEntity = new PaymentDetailsEntity(bookingId, paymentDetail);
		return this.paymentDetailDao.save(paymentDetailsEntity).getBookingId();
	}
	
	public PaymentDetailsEntity getPaymentById(int paymentId) throws Exception {
		Optional<PaymentDetailsEntity> paymentDetailDaoOp=  this.paymentDetailDao.findById(paymentId);
		
		if(paymentDetailDaoOp.isPresent()) {
			return paymentDetailDaoOp.get();
		}else {
			throw new Exception("Payment Id Not Found");
		}
	}
	
}
