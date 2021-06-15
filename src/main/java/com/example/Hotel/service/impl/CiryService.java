package com.example.Hotel.service.impl;

import com.example.Hotel.entity.Account;
import com.example.Hotel.entity.City;
import com.example.Hotel.entity.Hotel;
import com.example.Hotel.exeptions.AccountNotFoundExeption;
import com.example.Hotel.exeptions.CityNotFoundException;
import com.example.Hotel.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiryService {
    private final CityRepository cityRepository;

    @Autowired
    public CiryService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City getById (Long cityId){
        return cityRepository.findById(cityId).orElseThrow(()->new CityNotFoundException("Unable to find account with id: " + cityId));
    }

    public Long save (String cityindex, String cityname, String googlecoordinate, List<Hotel> hotel){
        City city = new City(cityindex, cityname, googlecoordinate, hotel);
        return cityRepository.save(city).getCityId();
    }
}
