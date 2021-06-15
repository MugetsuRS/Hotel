package com.example.Hotel.repository;


import com.example.Hotel.entity.Trips;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripsRepository extends JpaRepository<Trips, Long> {
}
