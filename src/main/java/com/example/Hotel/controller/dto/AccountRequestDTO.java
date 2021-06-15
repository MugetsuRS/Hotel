package com.example.Hotel.controller.dto;

import java.util.List;

public class AccountRequestDTO {
    private String name;
    private String surrname;
    private String password;
    private String email;
    private List<MyTripsRequestDTO> mytrips;

    public String getName() {
        return name;
    }

    public String getSurrname() {
        return surrname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public List<MyTripsRequestDTO> getMytrips() {
        return mytrips;
    }
}
