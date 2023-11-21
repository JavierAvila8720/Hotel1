package com.reservation.hotelsJuan.mgnreservation.repository;

import com.reservation.hotelsJuan.mgnreservation.entity.Suite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuiteRepository  extends JpaRepository<Suite,Long> {

}
