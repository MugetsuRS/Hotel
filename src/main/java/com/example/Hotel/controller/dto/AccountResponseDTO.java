package com.example.Hotel.controller.dto;

import com.example.Hotel.entity.Account;

import java.util.List;
import java.util.stream.Collectors;

public class AccountResponseDTO {
    private Long accountId;
    private String name;
    private String surrname;
    private String password;
    private String email;

    private List<MyTripsResponceDTO> mytrips;

    public AccountResponseDTO (Account account){
        accountId = account.getAccountId();
        name = account.getName();
        surrname = account.getSurrname();
        password = account.getPassword();
        email = account.getEmail();
        mytrips = account.getMytrips().stream()
                .map(MyTripsResponceDTO::new)
                .collect(Collectors.toList());
    }

    public AccountResponseDTO(Long accountId, String name, String surrname, String password, String email, List<MyTripsResponceDTO> mytrips) {
        this.accountId = accountId;
        this.name = name;
        this.surrname = surrname;
        this.password = password;
        this.email = email;
        this.mytrips = mytrips;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurrname() {
        return surrname;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<MyTripsResponceDTO> getMytrips() {
        return mytrips;
    }

    public void setMytrips(List<MyTripsResponceDTO> mytrips) {
        this.mytrips = mytrips;
    }
}
