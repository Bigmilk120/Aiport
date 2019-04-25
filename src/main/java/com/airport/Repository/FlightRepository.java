package com.airport.Repository;

import com.airport.Models.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FlightRepository extends MongoRepository<Flight, String> {
    List<Flight> findByDestination(String destination);
}
