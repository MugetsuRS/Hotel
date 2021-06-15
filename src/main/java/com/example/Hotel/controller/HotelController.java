package com.example.Hotel.controller;

import com.example.Hotel.controller.dto.FilterData;
import com.example.Hotel.entity.Hotel;
import com.example.Hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping("/hotel")
@RestController
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getById(@PathVariable final Long hotelId) {
        final Hotel hotel = hotelService.findById(hotelId)
                .orElseThrow(() -> new IllegalStateException("Hotel with id: " + hotelId + " not found"));

        return ResponseEntity.ok(hotel);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Hotel>> getHotels(@RequestBody final FilterData filterData) {
        final List<Hotel> filtered = hotelService.getFiltered(filterData);

        return ResponseEntity.ok(filtered);
    }
}
