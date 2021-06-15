package com.example.Hotel.controller.dto;

import com.example.Hotel.entity.City;

import java.util.List;
import java.util.stream.Collectors;

public class CityResponceDTO {
    private Long cityId;
    private String cityindex;
    private String cityname;
    private String googlecoordinate;
    private List<HotelResponceDTO> hotel;

    public CityResponceDTO(City city) {
        cityId = city.getCityId();
        cityindex = city.getCityindex();
        cityname = city.getCityname();
        googlecoordinate = city.getGooglecoordinate();
        hotel = city.getHotel().stream()
                .map(HotelResponceDTO::new).collect(Collectors.toList());
    }

    public CityResponceDTO(Long cityId, String cityindex, String cityname, String googlecoordinate, List<HotelResponceDTO> hotel) {
        this.cityId = cityId;
        this.cityindex = cityindex;
        this.cityname = cityname;
        this.googlecoordinate = googlecoordinate;
        this.hotel = hotel;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityindex() {
        return cityindex;
    }

    public void setCityindex(String cityindex) {
        this.cityindex = cityindex;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getGooglecoordinate() {
        return googlecoordinate;
    }

    public void setGooglecoordinate(String googlecoordinate) {
        this.googlecoordinate = googlecoordinate;
    }

    public List<HotelResponceDTO> getHotel() {
        return hotel;
    }

    public void setHotel(List<HotelResponceDTO> hotel) {
        this.hotel = hotel;
    }
}
