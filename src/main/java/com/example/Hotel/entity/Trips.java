package com.example.Hotel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trips {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tripId;

    private String indate;
    private String outdate;
    private String hotel;
    private String description;

    public Trips() {

    }

    public Trips(String indate, String outdate, String hotel, String description) {
        this.indate = indate;
        this.outdate = outdate;
        this.hotel = hotel;
        this.description = description;
    }

    public Long getTripId() {
        return tripId;
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
        return "Trips{" +
                "tripId=" + tripId +
                ", indate='" + indate + '\'' +
                ", outdate='" + outdate + '\'' +
                ", hotel='" + hotel + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
