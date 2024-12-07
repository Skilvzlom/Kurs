package com.example.kurs.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Класс, описывающий модель ВС в базе данных
 */

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Aircraft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aircraftId;
    @Column(name = "aircraftType")
    private String aircraftType;
    @Column(name = "aircraftRegistration")
    private String aircraftRegistration;

    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftId=" + aircraftId +
                ", aircraftType='" + aircraftType + '\'' +
                ", aircraftRegistration='" + aircraftRegistration + '\'' +
                ", maxTakeoffWeight=" + maxTakeoffWeight +
                ", maxCruiseSpeed=" + maxCruiseSpeed +
                ", aircraftCapacity=" + aircraftCapacity +
                '}';
    }

    @Column(name = "maxTakeoffWeight")
    private Double maxTakeoffWeight;
    @Column(name = "maxCruiseSpeed")
    private Double maxCruiseSpeed;
    @Column(name = "aircraftCapacity")
    private Integer aircraftCapacity;

    public Long getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Long aircraftId) {
        this.aircraftId = aircraftId;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    public void setAircraftRegistration(String aircraftRegistration) {
        this.aircraftRegistration = aircraftRegistration;
    }

    public Double getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    public void setMaxTakeoffWeight(Double maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
    }

    public Double getMaxCruiseSpeed() {
        return maxCruiseSpeed;
    }

    public void setMaxCruiseSpeed(Double maxCruiseSpeed) {
        this.maxCruiseSpeed = maxCruiseSpeed;
    }

    public Integer getAircraftCapacity() {
        return aircraftCapacity;
    }

    public void setAircraftCapacity(Integer aircraftCapacity) {
        this.aircraftCapacity = aircraftCapacity;
    }
}
