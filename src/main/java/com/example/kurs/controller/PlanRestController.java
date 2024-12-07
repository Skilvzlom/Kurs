package com.example.kurs.controller;

import com.example.kurs.model.Aircraft;
import com.example.kurs.model.FlightRoutes;
import com.example.kurs.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RestController, контроллер для работы с моделью
 */
@RestController
@RequestMapping("/api")
public class PlanRestController {

    private final PlanService planService;

    @Autowired
    public PlanRestController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping("/plans")
    public ResponseEntity<List<FlightRoutes>> getAllPlans() {
        return new ResponseEntity<>(planService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/plans/{id}")
    public ResponseEntity<FlightRoutes> getPlanById(@PathVariable Long id) {
        return new ResponseEntity<>(planService.getFlightPlan(id), HttpStatus.OK);
    }

    @GetMapping("/plans/aircraft")
    public ResponseEntity<List<Aircraft>> getAllAircraft() {
        return new ResponseEntity<>(planService.findAllPlanes(), HttpStatus.OK);
    }

    @PostMapping("/plans")
    public ResponseEntity<String> addPlan(@RequestBody FlightRoutes flightRoutes) {
        try {
            planService.addFlightPlan(flightRoutes);
            return new ResponseEntity<>("Ok", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/plans/aircraft")
    public ResponseEntity<String> addAircraft(@RequestBody Aircraft aircraft) {
        try {
            System.out.println(aircraft);
            planService.addAircraft(aircraft);
            return new ResponseEntity<>("Ok", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/plans")
    public ResponseEntity<String> updatePlan(@RequestBody FlightRoutes flightRoutes) {
        try {
            planService.addFlightPlan(flightRoutes);
            return new ResponseEntity<>("Ok", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/plans/aircraft")
    public ResponseEntity<String> updateAircraft(@RequestBody Aircraft aircraft) {
        try {
            System.out.println(aircraft);
            planService.addAircraft(aircraft);
            return new ResponseEntity<>("Ok", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
