package com.sweethome.serchservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sweethome.serchservice.model.dto.RoomBookingDto;
import com.sweethome.serchservice.service.RoomSearchService;

@RestController
public class SearchController {

	RoomSearchService roomSearchService;

	
	@Autowired
	public SearchController(RoomSearchService roomSearchService) {
		super();
		this.roomSearchService = roomSearchService;
	}
	
	@GetMapping("/search/{count}")
	public ResponseEntity<String> searchRoom(@PathVariable int count) {
		String roomNumber =  this.roomSearchService.findRoomIds(count);
		
		return new ResponseEntity<String>(roomNumber, HttpStatus.OK);
	}
	
	@PostMapping("/search/save")
	public ResponseEntity<Integer> saveBooking(@RequestBody RoomBookingDto roomBookingDetails) {
		int searchId =  this.roomSearchService.saveBookingDetails(roomBookingDetails);
		
		return new ResponseEntity<Integer>(searchId, HttpStatus.CREATED);
	}
	
	
	
	
}
