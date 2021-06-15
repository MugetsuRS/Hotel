package com.example.Hotel.controller.dto;

import com.example.Hotel.entity.MyTrips;

public class MyTripsResponceDTO {

    private Long mytripsId;
    private String indate;
    private String outdate;
    private String hotel;
    private String description;

    public MyTripsResponceDTO(MyTrips myTrips){
        mytripsId = myTrips.getMytripsId();
        indate = myTrips.getIndate();
        outdate = myTrips.getOutdate();
        hotel = myTrips.getHotel();
        description = myTrips.getDescription();
    }

    public MyTripsResponceDTO(Long mytripsId, String indate, String outdate, String hotel, String description) {
        this.mytripsId = mytripsId;
        this.indate = indate;
        this.outdate = outdate;
        this.hotel = hotel;
        this.description = description;
    }

    public Long getMytripsId() {
        return mytripsId;
    }

    public void setMytripsId(Long mytripsId) {
        this.mytripsId = mytripsId;
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
