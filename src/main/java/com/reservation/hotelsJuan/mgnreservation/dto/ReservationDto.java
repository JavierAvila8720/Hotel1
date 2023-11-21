package com.reservation.hotelsJuan.mgnreservation.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ReservationDto implements Serializable  {
    private String id;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private String hotelId;
    private String personId;
    private String suitId;
    private String status;

}
