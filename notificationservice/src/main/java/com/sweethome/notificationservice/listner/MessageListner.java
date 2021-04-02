package com.sweethome.notificationservice.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.sweethome.notificationservice.model.Message;

@Service
public class MessageListner {

	
	@KafkaListener(topics = "message", groupId = "group_id",
			containerFactory = "messageListnerFactory")
	public void messageListner(Message message) {
		System.out.println("Message:  Hi Your Booking is Conformed. your Booking Id id "+ message.getBookingId()+".  See you Soon.");
		System.out.println("Email: Hi Your Booking is Confirmed for "+message.getToDate()+" and Booking ID is "+message.getBookingId()+". For and help please Contact below Link.");
	}
	
}
