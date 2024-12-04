package com.example.kurs.respository;

import com.example.kurs.model.FlightRoutes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<FlightRoutes, Long> {
}
