package com.sweethome.serchservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sweethome.serchservice.model.dto.RoomBookingDto;

@Repository
public interface RoomBookingDetailDao extends JpaRepository<RoomBookingDto, Integer> {

}
