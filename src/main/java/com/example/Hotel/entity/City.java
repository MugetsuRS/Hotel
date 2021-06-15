package com.example.Hotel.entity;

import javax.persistence.*;
import java.util.List;
import javax.validation.constraints.Size;
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cityId;
    private String cityindex;
    private String cityname;

    @Size(max = 350)
    private String googlecoordinate;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Hotel> hotel;

    public City() {
    }

    public City(String cityindex, String cityname, String googlecoordinate, List<Hotel> hotel) {
        this.cityindex = cityindex;
        this.cityname = cityname;
        this.googlecoordinate = googlecoordinate;
        this.hotel = hotel;
    }

    public Long getCityId() {
        return cityId;
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

    public List<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(List<Hotel> hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "City{" +
                "ciryId=" + cityId +
                ", cityindex='" + cityindex + '\'' +
                ", cityname='" + cityname + '\'' +
                ", googlecoordinate='" + googlecoordinate + '\'' +
                ", hotel=" + hotel +
                '}';
    }
}
