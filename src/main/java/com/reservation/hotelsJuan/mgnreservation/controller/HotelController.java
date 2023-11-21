package com.reservation.hotelsJuan.mgnreservation.controller;

import com.reservation.hotelsJuan.mgnreservation.entity.Hotel;
import com.reservation.hotelsJuan.mgnreservation.exception.BadRequestException;
import com.reservation.hotelsJuan.mgnreservation.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mgn-reservation")
public class HotelController {


    @Autowired
    private final HotelService hotelService; // Suponiendo que SuiteService es un servicio que implementa la lógica de negocio

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }


    @GetMapping("/V1/hotels/{page}")
    public ResponseEntity<?> getHotels(@PathVariable int page, @RequestHeader("clientId") String clientId,
                                         @RequestHeader("secretId") String secretId,
                                         @RequestHeader("correlationId") String correlationId) {
        // Implementa la lógica para buscar suites (suites) según el número de página
        // y valida los encabezados de solicitud
        try {
            List<Hotel> hotels = hotelService.getHotels(page, clientId, secretId, correlationId);
            return ResponseEntity.ok().body(hotels); // Para una respuesta exitosa (200)
        } catch (BadRequestException e) {
            return ResponseEntity.status(400).body(e.getMessage()); // Para un error de solicitud (400)
        }
    }






}
