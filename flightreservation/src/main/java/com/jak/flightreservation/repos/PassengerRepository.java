package com.jak.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jak.flightreservation.entities.Flight;

public interface PassengerRepository extends JpaRepository<Flight, Long> {

}
