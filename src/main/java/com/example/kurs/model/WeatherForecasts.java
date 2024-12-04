package com.example.kurs.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@RequiredArgsConstructor
public class WeatherForecasts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long weatherId;

    @ManyToOne
    @JoinColumn(name = "route_id", referencedColumnName = "routeId")
    private FlightRoutes flightRoute;

    private String departureWeather;
    private String arrivalWeather;
    private Double windSpeed;
    private Double temperature;
    private String turbulence;
    private LocalDateTime forecastDate;
}
