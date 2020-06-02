package com.jak.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jak.flightreservation.entities.Reservation;

public interface FlightRepository extends JpaRepository<Reservation, Long> {

}
