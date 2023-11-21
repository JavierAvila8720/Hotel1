package com.reservation.hotelsJuan.mgnreservation.service;

import com.reservation.hotelsJuan.mgnreservation.entity.Hotel;
import com.reservation.hotelsJuan.mgnreservation.exception.BadRequestException;

import java.util.List;

public interface HotelService {

    List<Hotel> getHotels(int page, String clientId, String secretId, String correlationId)
            throws BadRequestException;

}
