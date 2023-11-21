package com.reservation.hotelsJuan.mgnreservation.controller;

import com.reservation.hotelsJuan.mgnreservation.dto.ErrorResponseDto;
import com.reservation.hotelsJuan.mgnreservation.dto.ReservationRequestDto;
import com.reservation.hotelsJuan.mgnreservation.dto.ReservationResponseDto;
import com.reservation.hotelsJuan.mgnreservation.dto.SuiteDto;
import com.reservation.hotelsJuan.mgnreservation.entity.Suite;
import com.reservation.hotelsJuan.mgnreservation.exception.BadRequestException;
import com.reservation.hotelsJuan.mgnreservation.service.SuiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mgn-reservation")
public class SuiteController {


    @Autowired
    private final SuiteService suiteService; // Suponiendo que SuiteService es un servicio que implementa la lógica de negocio

    public SuiteController(SuiteService suiteService) {
        this.suiteService = suiteService;
    }

    @GetMapping("/v1/suits/{page}")
    public ResponseEntity<?> searchSuits(@PathVariable int page, @RequestHeader("clientId") String clientId,
                                         @RequestHeader("secretId") String secretId,
                                         @RequestHeader("correlationId") String correlationId) {
        // Implementa la lógica para buscar suites (suites) según el número de página
        // y valida los encabezados de solicitud
        try {
            List<Suite> suites = suiteService.getSuites(page, clientId, secretId, correlationId);
            return ResponseEntity.ok().body(suites); // Para una respuesta exitosa (200)
        } catch (BadRequestException e) {
            return ResponseEntity.status(400).body(e.getMessage()); // Para un error de solicitud (400)
        }
    }



    @PostMapping("/V1/suite")
    public ResponseEntity<?> createReservation(@RequestBody ReservationRequestDto request,
                                               @RequestHeader("clientId") String clientId,
                                               @RequestHeader("secretId") String secretId,
                                               @RequestHeader("correlationId") String correlationId) {
        try {
            // Validar encabezados y solicitud
            // Implementar lógica para crear la reserva en la suite usando los datos del objeto 'request'
            // ...

            // Si la reserva se crea exitosamente
            ReservationResponseDto responseDTO = new ReservationResponseDto("ok","1290909678900");


            return ResponseEntity.status(HttpStatus.OK).body(responseDTO);

        } catch (BadRequestException e) {
            ErrorResponseDto errorResponse = new ErrorResponseDto("ok","bad request");

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }


}
