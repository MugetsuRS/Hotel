package com.example.Hotel.controller;


import com.example.Hotel.controller.dto.CityResponceDTO;
import com.example.Hotel.controller.dto.TripsRequestDTO;
import com.example.Hotel.controller.dto.TripsResponceDTO;
import com.example.Hotel.entity.Trips;
import com.example.Hotel.service.impl.TripsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping("/trip")
@RestController
public class TripsController {
    private final TripsService tripsService;

    @Autowired
    public TripsController(TripsService tripsService) {
        this.tripsService = tripsService;
    }

    @GetMapping("/{tripId}")
    public TripsResponceDTO getById(@PathVariable Long tripId){
        return new TripsResponceDTO(tripsService.getById(tripId));
    }

    @PostMapping
    public Long create (@RequestBody TripsRequestDTO tripsRequestDTO){
        return tripsService.save(tripsRequestDTO.getIndate(), tripsRequestDTO.getOutdate(), tripsRequestDTO.getHotel(), tripsRequestDTO.getDescription());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Trips>> getTrips(){
        final List<Trips> trips = tripsService.getAll();
        return ResponseEntity.ok(trips);
    }

}
