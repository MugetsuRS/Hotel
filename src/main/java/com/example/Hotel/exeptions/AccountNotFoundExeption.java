package com.example.Hotel.exeptions;

public class AccountNotFoundExeption extends RuntimeException{

    public AccountNotFoundExeption(String message) {
        super(message);
    }
}
