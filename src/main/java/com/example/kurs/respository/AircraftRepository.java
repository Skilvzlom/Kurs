package com.example.kurs.respository;

import com.example.kurs.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для взаимодействия модели и Aircraft и Базы данных
 */
@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {
}
