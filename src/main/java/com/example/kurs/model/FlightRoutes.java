package com.example.kurs.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@ToString
@RequiredArgsConstructor
public class FlightRoutes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long routeId;

    @ManyToOne
    @JoinColumn(name = "aircraft_id", referencedColumnName = "aircraftId")
    private Aircraft aircraft;

    private String departureAirport;
    private String arrivalAirport;
    private Double routeLength;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String flightPlan;

    @OneToMany(mappedBy = "flightRoute", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<WeatherForecasts> weatherForecasts;

    @OneToMany(mappedBy = "flightRoute", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<NavigationData> navigationData;

    @OneToMany(mappedBy = "flightRoute", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FuelRequirements> fuelRequirements;

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Double getRouteLength() {
        return routeLength;
    }

    public void setRouteLength(Double routeLength) {
        this.routeLength = routeLength;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getFlightPlan() {
        return flightPlan;
    }

    public void setFlightPlan(String flightPlan) {
        this.flightPlan = flightPlan;
    }

    public List<WeatherForecasts> getWeatherForecasts() {
        return weatherForecasts;
    }

    public void setWeatherForecasts(List<WeatherForecasts> weatherForecasts) {
        this.weatherForecasts = weatherForecasts;
    }

    public List<NavigationData> getNavigationData() {
        return navigationData;
    }

    public void setNavigationData(List<NavigationData> navigationData) {
        this.navigationData = navigationData;
    }

    public List<FuelRequirements> getFuelRequirements() {
        return fuelRequirements;
    }

    public void setFuelRequirements(List<FuelRequirements> fuelRequirements) {
        this.fuelRequirements = fuelRequirements;
    }
}
