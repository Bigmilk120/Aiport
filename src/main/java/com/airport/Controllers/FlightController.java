package com.airport.Controllers;

import com.airport.Models.DatesToFilter;
import com.airport.Models.Flight;
import com.airport.Models.Plane;
import com.airport.Repository.FlightRepository;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
public class FlightController {
    @Autowired
    FlightRepository flightRepository;

    @GetMapping(value="/flightsShow")
    public List<Flight> flightShow(){
        return flightRepository.findAll();
    }

    @PostMapping(value="/flightAdd")
    public void flightAdd(@RequestBody Flight flight){
        flightRepository.insert(flight);
    }

    @PostMapping(value="/flight")
    public List<Flight> flightShowByDestination(@RequestBody String destination){
        return flightRepository.findByDestination(destination);
    }

    @PostMapping(value="/flightDate")
    public List<Flight> flightshowFromDateToDate(@RequestBody DatesToFilter date){
        return flightRepository.findByDateBetween(date.getDateFrom(),date.getDateTo());
    }


}
