package com.sweethome.serchservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sweethome.serchservice.model.RoomBookingDetails;
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
	public String searchRoom(@PathVariable int count) {
		return this.roomSearchService.findRoomIds(count);
	}
	
	@PostMapping("/search/save")
	public int saveBooking(@RequestBody RoomBookingDetails roomBookingDetails) {
		return this.roomSearchService.saveBookingDetails(roomBookingDetails);
	}
	
	
	
	
}
