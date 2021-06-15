package com.example.Hotel.controller.dto;

import com.example.Hotel.entity.Hotel;

public class HotelResponceDTO {
    private Long hotelId;
    private String hotelname;
    private String coordinate;
    private String price1;
    private String price2;
    private String link1;
    private String link2;
    private String stars;
    private String style;
    private boolean wifi;
    private boolean breakfast;
    private boolean pool;
    private String description;
    private String photolink0;
    private String photolink1;
    private String photolink2;
    private String photolink3;
    private String photolink4;
    private String city;

    public HotelResponceDTO (Hotel hotel){
        hotelId = hotel.getHotelId();
        hotelname = hotel.getHotelname();
        coordinate = hotel.getCoordinate();
        price1 = hotel.getPrice1();
        price2 = hotel.getPrice2();
        link1 = hotel.getLink1();
        link2 = hotel.getLink2();
        stars = hotel.getStars();
        style = hotel.getStyle();
        wifi = hotel.isWifi();
        breakfast = hotel.isBreakfast();
        pool = hotel.isPool();
        description = hotel.getDescription();
        photolink0 = hotel.getPhotolink0();
        photolink1 = hotel.getPhotolink1();
        photolink2 = hotel.getPhotolink2();
        photolink3 = hotel.getPhotolink3();
        photolink4 = hotel.getPhotolink4();
        city = hotel.getCity();
    }

    public HotelResponceDTO(Long hotelId, String hotelname, String coordinate, String price1, String price2, String link1, String link2, String stars, String style, boolean wifi,
                            boolean breakfast, boolean pool, String description, String photolink0, String photolink1, String photolink2, String photolink3, String photolink4,
                            String city) {
        this.hotelId = hotelId;
        this.hotelname = hotelname;
        this.coordinate = coordinate;
        this.price1 = price1;
        this.price2 = price2;
        this.link1 = link1;
        this.link2 = link2;
        this.stars = stars;
        this.style = style;
        this.wifi = wifi;
        this.breakfast = breakfast;
        this.pool = pool;
        this.description = description;
        this.photolink0 = photolink0;
        this.photolink1 = photolink1;
        this.photolink2 = photolink2;
        this.photolink3 = photolink3;
        this.photolink4 = photolink4;
        this.city = city;

    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public String getPrice2() {
        return price2;
    }

    public void setPrice2(String price2) {
        this.price2 = price2;
    }

    public String getLink1() {
        return link1;
    }

    public void setLink1(String link1) {
        this.link1 = link1;
    }

    public String getLink2() {
        return link2;
    }

    public void setLink2(String link2) {
        this.link2 = link2;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotolink0() {
        return photolink0;
    }

    public void setPhotolink0(String photolink0) {
        this.photolink0 = photolink0;
    }

    public String getPhotolink1() {
        return photolink1;
    }

    public void setPhotolink1(String photolink1) {
        this.photolink1 = photolink1;
    }

    public String getPhotolink2() {
        return photolink2;
    }

    public void setPhotolink2(String photolink2) {
        this.photolink2 = photolink2;
    }

    public String getPhotolink3() {
        return photolink3;
    }

    public void setPhotolink3(String photolink3) {
        this.photolink3 = photolink3;
    }

    public String getPhotolink4() {
        return photolink4;
    }

    public void setPhotolink4(String photolink4) {
        this.photolink4 = photolink4;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
