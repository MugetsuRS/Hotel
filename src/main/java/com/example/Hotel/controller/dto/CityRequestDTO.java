package com.example.Hotel.controller.dto;

import com.example.Hotel.entity.Hotel;

import java.util.List;

public class CityRequestDTO {
    private String cityindex;
    private String cityname;
    private String googlecoordinate;
    private List<HotelRequestDTO> hotel;

    public String getCityindex() {
        return cityindex;
    }

    public String getCityname() {
        return cityname;
    }

    public String getGooglecoordinate() {
        return googlecoordinate;
    }

    public List<HotelRequestDTO> getHotel() {
        return hotel;
    }
}
