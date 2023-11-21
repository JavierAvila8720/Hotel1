package com.reservation.hotelsJuan.mgnreservation.service.impl;
import com.reservation.hotelsJuan.mgnreservation.entity.Hotel;
import com.reservation.hotelsJuan.mgnreservation.exception.BadRequestException;
import com.reservation.hotelsJuan.mgnreservation.repository.HotelRepository;
import com.reservation.hotelsJuan.mgnreservation.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public List<Hotel> getHotels(int page, String clientId, String secretId, String correlationId) throws BadRequestException {
        return  hotelRepository.findAll()  ;
    }


}
