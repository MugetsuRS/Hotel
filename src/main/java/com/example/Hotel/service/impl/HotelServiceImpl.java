package com.example.Hotel.service.impl;

import com.example.Hotel.controller.dto.FilterData;
import com.example.Hotel.entity.Hotel;
import com.example.Hotel.repository.HotelRepository;
import com.example.Hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Optional<Hotel> findById(final Long hotelId) {
        return hotelRepository.findById(hotelId);
    }

    @Override
    public List<Hotel> getFiltered(final FilterData filterData) {
        final List<Hotel> hotels = hotelRepository.findAll();

        final String stars = filterData.getStars();
        final String style = filterData.getStyle();
        final boolean breakfast = filterData.isBreakfast();
        final boolean pool = filterData.isPool();
        final boolean wifi = filterData.isWifi();
        final String lowPrice = filterData.getLowPrice();
        final String upPrice = filterData.getUpPrice();

        if (stars != null) {
            hotels.forEach(h -> {
                if (!h.getStars().equals(stars)) {
                    hotels.remove(h);
                }
            });
        }
        if (style != null) {
            hotels.forEach(h -> {
                if (!h.getStyle().equals(style)) {
                    hotels.remove(h);
                }
            });
        }
        if (breakfast) {
            hotels.forEach(h -> {
                if (!h.isBreakfast()) {
                    hotels.remove(h);
                }
            });
        }
        if (pool) {
            hotels.forEach(h -> {
                if (!h.isPool()) {
                    hotels.remove(h);
                }
            });
        }
        if (wifi) {
            hotels.forEach(h -> {
                if (!h.isWifi()) {
                    hotels.remove(h);
                }
            });
        }
        if (lowPrice != null) {
            hotels.forEach(h -> {
                if (Integer.parseInt(h.getPrice1()) >= Integer.parseInt(lowPrice)) {
                    hotels.remove(h);
                }
            });
        }
        if (upPrice != null) {
            hotels.forEach(h -> {
                if (Integer.parseInt(h.getPrice1()) <= Integer.parseInt(upPrice)) {
                    hotels.remove(h);
                }
            });
        }

        return hotels;
    }
}
