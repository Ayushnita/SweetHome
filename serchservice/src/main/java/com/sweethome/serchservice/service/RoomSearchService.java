package com.sweethome.serchservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sweethome.serchservice.dao.RoomBookingDetailDao;
import com.sweethome.serchservice.model.RoomBookingDetails;

@Service
public class RoomSearchService {

	RoomBookingDetailDao roomBookingDetailDao;

	@Autowired
	public RoomSearchService(RoomBookingDetailDao roomBookingDetailDao) {
		super();
		this.roomBookingDetailDao = roomBookingDetailDao;
	}
	
	int currentRoomBook = 0;
	
	public String findRoomIds(int count) {
		String out ="";
		for(int i = currentRoomBook + 1; i <= currentRoomBook + count; i++) {
			out += i +", ";
		}
		
		currentRoomBook += count;
		
		return out;
		
	}
	
	public int saveBookingDetails(RoomBookingDetails bookingDetails) {
		return this.roomBookingDetailDao.save(bookingDetails).getBookingId();
	}
	
	
}
