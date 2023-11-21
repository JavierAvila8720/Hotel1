package com.reservation.hotelsJuan.mgnreservation.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ReservationRequestDto implements Serializable {
    private String hotelId;
    private String roomId;
    private PersonDto person;
    private LocalDate reservationStartDate;

    public ReservationRequestDto(String hotelId, String roomId, PersonDto person, LocalDate reservationStartDate) {
        this.hotelId = hotelId;
        this.roomId = roomId;
        this.person = person;
        this.reservationStartDate = reservationStartDate;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getRoomId() {
        return roomId;
    }

    public PersonDto getPerson() {
        return person;
    }

    public LocalDate getReservationStartDate() {
        return reservationStartDate;
    }
}
