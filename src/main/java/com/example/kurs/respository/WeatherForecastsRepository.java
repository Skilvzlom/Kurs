package com.example.kurs.respository;

import com.example.kurs.model.WeatherForecasts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherForecastsRepository extends JpaRepository<WeatherForecasts, Long> {
}
