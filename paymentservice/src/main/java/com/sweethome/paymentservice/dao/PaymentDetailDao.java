package com.sweethome.paymentservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sweethome.paymentservice.model.PaymentDetailsEntity;

public interface PaymentDetailDao extends JpaRepository<PaymentDetailsEntity, Integer> {

}
