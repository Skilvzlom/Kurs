package com.example.kurs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@Entity
@ToString
@RequiredArgsConstructor
public class Aircraft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aircraftId;

    private String aircraftType;
    private String aircraftRegistration;
    private Double maxTakeoffWeight;
    private Double maxCruiseSpeed;
    private Integer aircraftCapacity;

}
