package com.airport.Controllers;

import com.airport.Models.DatesToFilter;
import com.airport.Models.Flight;
import com.airport.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @PostMapping(value="/flightToFrom")
    public List<Flight> flightshowToFrom(@RequestBody Flight flight){
        return flightRepository.findByDestinationAndOrigin(flight.getDestination(), flight.getOrigin());
    }

}
