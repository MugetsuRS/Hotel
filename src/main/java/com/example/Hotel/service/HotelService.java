package com.example.Hotel.service;

import com.example.Hotel.controller.dto.FilterData;
import com.example.Hotel.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface HotelService {
    Optional<Hotel> findById(Long hotelId);

    List<Hotel> getFiltered(final FilterData filterData);
}
