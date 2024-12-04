package com.example.kurs.respository;

import com.example.kurs.model.FuelRequirements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelRequirementsRepository extends JpaRepository<FuelRequirements, Long> {
}
