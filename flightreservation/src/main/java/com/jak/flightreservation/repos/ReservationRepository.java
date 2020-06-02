package com.jak.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jak.flightreservation.entities.Flight;
import com.jak.flightreservation.entities.Passenger;

public interface ReservationRepository extends JpaRepository<Passenger, Long> {

}
