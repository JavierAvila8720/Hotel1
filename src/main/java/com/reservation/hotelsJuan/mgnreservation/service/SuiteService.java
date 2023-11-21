package com.reservation.hotelsJuan.mgnreservation.service;
import com.reservation.hotelsJuan.mgnreservation.dto.ReservationRequestDto;
import com.reservation.hotelsJuan.mgnreservation.entity.Suite;
import com.reservation.hotelsJuan.mgnreservation.exception.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.reservation.hotelsJuan.mgnreservation.dto.SuiteDto;

import java.util.List;

public interface SuiteService {

    List<Suite> getSuites(int page, String clientId, String secretId, String correlationId)
            throws BadRequestException;

    String createReservation(ReservationRequestDto request, String clientId, String secretId, String correlationId)
            throws BadRequestException;


}
