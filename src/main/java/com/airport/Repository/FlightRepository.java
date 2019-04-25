package com.airport.Repository;

import com.airport.Models.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FlightRepository extends MongoRepository<Flight, String> {
    List<Flight> findByDestination(String destination);
    List<Flight> findByDateBetween(String from, String to);
}
