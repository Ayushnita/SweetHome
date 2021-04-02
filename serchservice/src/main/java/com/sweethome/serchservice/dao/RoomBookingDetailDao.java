package com.sweethome.serchservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sweethome.serchservice.model.RoomBookingDetails;

@Repository
public interface RoomBookingDetailDao extends JpaRepository<RoomBookingDetails, Integer> {

}
