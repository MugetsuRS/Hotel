package com.example.Hotel.service.impl;

import com.example.Hotel.entity.City;
import com.example.Hotel.entity.Hotel;
import com.example.Hotel.entity.Trips;
import com.example.Hotel.exeptions.CityNotFoundException;
import com.example.Hotel.repository.TripsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripsService {
    private final TripsRepository tripsRepository;

    @Autowired
    public TripsService(TripsRepository tripsRepository) {
        this.tripsRepository = tripsRepository;
    }

    public Trips getById (Long tripId){
        return tripsRepository.findById(tripId).orElseThrow(()->new CityNotFoundException("Unable to find trip with id: " + tripId));
    }


    public Long save (String indate, String outdate, String hotel, String description){
        Trips trips = new Trips(indate, outdate, hotel, description);
        return tripsRepository.save(trips).getTripId();
    }

    public List<Trips> getAll (){
        final List<Trips> trips = tripsRepository.findAll();
        return trips;
    }
}
