package com.example.Hotel.controller.dto;

import com.example.Hotel.entity.Trips;

public class TripsResponceDTO {
    private Long tripId;
    private String indate;
    private String outdate;
    private String hotel;
    private String description;

    public TripsResponceDTO(Trips trips) {
        tripId = trips.getTripId();
        indate = trips.getIndate();
        outdate = trips.getOutdate();
        hotel = trips.getHotel();
        description = trips.getDescription();
    }

    public TripsResponceDTO(Long tripId, String indate, String outdate, String hotel, String description) {
        this.tripId = tripId;
        this.indate = indate;
        this.outdate = outdate;
        this.hotel = hotel;
        this.description = description;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getOutdate() {
        return outdate;
    }

    public void setOutdate(String outdate) {
        this.outdate = outdate;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
