package com.samghebremedhin.WeatherApp.repository;

import com.samghebremedhin.WeatherApp.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WeatherRepository extends JpaRepository<Weather,Long> {
    Optional<Weather> findByCityName(String cityName);
    Optional<Weather> findByCoordId(Long coordId);
}
