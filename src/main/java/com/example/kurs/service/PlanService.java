package com.example.kurs.service;

import com.example.kurs.model.Aircraft;
import com.example.kurs.model.FlightRoutes;
import com.example.kurs.respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {

    private final PlanRepository planRepository;
    private final AircraftRepository aircraftRepository;
    private final NavigationDataRepository navigationDataRepository;
    private final WeatherForecastsRepository weatherForecastsRepository;
    private final FuelRequirementsRepository fuelRequirementsRepository;

    @Autowired
    public PlanService(PlanRepository planRepository, AircraftRepository aircraftRepository, NavigationDataRepository navigationDataRepository,
                       WeatherForecastsRepository weatherForecastsRepository, FuelRequirementsRepository fuelRequirementsRepository) {
        this.planRepository = planRepository;
        this.aircraftRepository = aircraftRepository;
        this.navigationDataRepository = navigationDataRepository;
        this.weatherForecastsRepository = weatherForecastsRepository;
        this.fuelRequirementsRepository = fuelRequirementsRepository;
    }

    public void addAircraft(Aircraft aircraft) {
        aircraftRepository.save(aircraft);
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

}
