package com.reservation.hotelsJuan.mgnreservation.repository;

import com.reservation.hotelsJuan.mgnreservation.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {

}
