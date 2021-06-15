package com.example.Hotel.controller;

import com.example.Hotel.controller.dto.CityRequestDTO;
import com.example.Hotel.controller.dto.CityResponceDTO;
import com.example.Hotel.entity.Hotel;
import com.example.Hotel.service.impl.CiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@CrossOrigin("*")
@RequestMapping("/city")
@RestController
public class CityController {
    private final CiryService ciryService;

    @Autowired
    public CityController(CiryService ciryService) {
        this.ciryService = ciryService;
    }


    @GetMapping("/{cityId}")
    public CityResponceDTO getById(@PathVariable Long cityId) {
        return new CityResponceDTO(ciryService.getById(cityId));
    }

    @PostMapping()
    public Long create(@RequestBody CityRequestDTO cityRequestDTO) {
        return ciryService.save(cityRequestDTO.getCityindex(), cityRequestDTO.getCityname(), cityRequestDTO.getGooglecoordinate(),
                cityRequestDTO.getHotel().stream().map(hotelRequestDTO -> new Hotel(
                        hotelRequestDTO.getHotelname(), hotelRequestDTO.getCoordinate(), hotelRequestDTO.getPrice1(), hotelRequestDTO.getPrice2(), hotelRequestDTO.getLink1(),
                        hotelRequestDTO.getLink2(), hotelRequestDTO.getStars(), hotelRequestDTO.getStyle(), hotelRequestDTO.isWifi(), hotelRequestDTO.isBreakfast(),
                        hotelRequestDTO.isPool(), hotelRequestDTO.getDescription(), hotelRequestDTO.getPhotolink0(), hotelRequestDTO.getPhotolink1(), hotelRequestDTO.getPhotolink2(),
                        hotelRequestDTO.getPhotolink3(), hotelRequestDTO.getPhotolink4(), hotelRequestDTO.getCity()))
                        .collect(Collectors.toList()));
    }
}
