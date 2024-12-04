package com.example.kurs.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@Getter
@Setter
@RequiredArgsConstructor
public class NavigationData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long navDataId;

    @ManyToOne
    @JoinColumn(name = "route_id", referencedColumnName = "routeId")
    private FlightRoutes flightRoute;

    private String waypoints;
    private String radioBeacons;
    private String routeChanges;
}
