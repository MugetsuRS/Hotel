package com.example.Hotel.entity;

import com.example.Hotel.controller.dto.MyTripsRequestDTO;

import javax.persistence.*;
import java.util.List;

@Entity
public class MyTrips {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mytripsId;
    private String indate;
    private String outdate;
    private String hotel;
    private String description;



    public MyTrips (MyTripsRequestDTO myTripsRequestDTO){
        indate = myTripsRequestDTO.getIndate();
        outdate = myTripsRequestDTO.getOutdate();
        hotel = myTripsRequestDTO.getHotel();
        description = myTripsRequestDTO.getDescription();
    }


    public MyTrips(String indate, String outdate, String hotel, String description) {
        this.indate = indate;
        this.outdate = outdate;
        this.hotel = hotel;
        this.description = description;
    }

    public MyTrips() {

    }

    public Long getMytripsId() {
        return mytripsId;
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

    @Override
    public String toString() {
        return "MyTrips{" +
                "mytripsId=" + mytripsId +
                ", indate='" + indate + '\'' +
                ", outdate='" + outdate + '\'' +
                ", hotel='" + hotel + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
