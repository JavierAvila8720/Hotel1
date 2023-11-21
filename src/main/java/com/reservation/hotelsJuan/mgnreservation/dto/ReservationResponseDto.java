package com.reservation.hotelsJuan.mgnreservation.dto;


import java.io.Serializable;

public class ReservationResponseDto implements Serializable {

    private String status;
    private String idReservation;

    public ReservationResponseDto(String status, String idReservation) {
        this.status = status;
        this.idReservation = idReservation;
    }

    public String getStatus() {
        return status;
    }

    public String getIdReservation() {
        return idReservation;
    }
}
