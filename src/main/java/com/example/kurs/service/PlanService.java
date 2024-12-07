package com.example.kurs.service;

import com.example.kurs.model.Aircraft;
import com.example.kurs.model.FlightRoutes;
import com.example.kurs.respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Сервисный слой у модели
 */
@Service
public class PlanService {

    private final PlanRepository planRepository;
    private final AircraftRepository aircraftRepository;


    @Autowired
    public PlanService(PlanRepository planRepository, AircraftRepository aircraftRepository) {
        this.planRepository = planRepository;
        this.aircraftRepository = aircraftRepository;
    }

    public void addAircraft(Aircraft aircraft) {
        aircraftRepository.save(aircraft);
    }

    public Aircraft getAircraftById(Long id) {
        return aircraftRepository.getById(id);
    }

    public void addFlightPlan(FlightRoutes flightRoutes) {
        planRepository.save(flightRoutes);
    }

    public FlightRoutes getFlightPlan(Long id) {
        return planRepository.getById(id);
    }

    public List<FlightRoutes> findAll() {
        return planRepository.findAll();
    }

    public List<Aircraft> findAllPlanes() {
        return aircraftRepository.findAll();
    }


}
