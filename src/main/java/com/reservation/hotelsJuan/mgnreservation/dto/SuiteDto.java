package com.reservation.hotelsJuan.mgnreservation.dto;

import java.io.Serializable;

public class SuiteDto implements Serializable {

    private String suitId;
    private String hotelId;
    private int numberOfBeds;
    private int suitPrice;
    private int roomStatus;

    // Getters y setters



    public SuiteDto(String suitId, String hotelId, int numberOfBeds, int suitPrice, int roomStatus) {
        this.suitId = suitId;
        this.hotelId = hotelId;
        this.numberOfBeds = numberOfBeds;
        this.suitPrice = suitPrice;
        this.roomStatus = roomStatus;
    }

    public String getSuitId() {
        return suitId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getSuitPrice() {
        return suitPrice;
    }

    public int getRoomStatus() {
        return roomStatus;
    }

}
