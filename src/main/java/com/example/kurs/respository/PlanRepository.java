package com.example.kurs.respository;

import com.example.kurs.model.FlightRoutes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Модель для взаимодействия модели PlanRepository и БД
 */
@Repository
public interface PlanRepository extends JpaRepository<FlightRoutes, Long> {
}
