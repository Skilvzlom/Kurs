package com.example.kurs.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@Getter
@Setter
@RequiredArgsConstructor
public class FuelRequirements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fuelId;

    @ManyToOne
    @JoinColumn(name = "route_id", referencedColumnName = "routeId")
    private FlightRoutes flightRoute;

    @ManyToOne
    @JoinColumn(name = "aircraft_id", referencedColumnName = "aircraftId")
    private Aircraft aircraft;

    private Double requiredFuel;
    private Double reserveFuel;
}
