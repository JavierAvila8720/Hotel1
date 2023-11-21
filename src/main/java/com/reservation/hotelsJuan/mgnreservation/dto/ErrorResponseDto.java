package com.reservation.hotelsJuan.mgnreservation.dto;

public class ErrorResponseDto {
    private String status;
    private String error;

    public ErrorResponseDto(String status, String error) {

        this.status = status;
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }
}
