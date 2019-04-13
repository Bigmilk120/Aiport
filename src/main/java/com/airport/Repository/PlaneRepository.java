package com.airport.Repository;

import com.airport.Models.Plane;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlaneRepository extends MongoRepository<Plane, String> {
}
