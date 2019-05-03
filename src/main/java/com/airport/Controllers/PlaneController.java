package com.airport.Controllers;

import com.airport.Models.Plane;
import com.airport.Repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlaneController {
    @Autowired
    PlaneRepository planeRepository;

    @GetMapping(value="/planesShow")
    public List<Plane> planesShow(){
        return planeRepository.findAll();
    }

    @PostMapping(value="/planeAdd")
    public void planeAdd(@RequestBody Plane plane){
        planeRepository.insert(plane);
    }

    @PostMapping(value="/planeShow")
    public List<Plane> planeShowByDestination(){
        return planeRepository.findAll();
    }
}
