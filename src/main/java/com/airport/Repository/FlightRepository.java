package com.airport.Repository;

import com.airport.Models.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface FlightRepository extends MongoRepository<Flight, String> {

    Flight findByOriginAndDestination(String origin, String destination);

}
