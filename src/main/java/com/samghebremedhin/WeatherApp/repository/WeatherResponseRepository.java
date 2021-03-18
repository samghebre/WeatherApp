package com.samghebremedhin.WeatherApp.repository;

import com.samghebremedhin.WeatherApp.model.Weather;
import com.samghebremedhin.WeatherApp.model.WeatherResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WeatherResponseRepository extends JpaRepository<WeatherResponse,Long> {
//    Optional<WeatherResponse> findByCityName(String cityName);
    Optional<WeatherResponse> findByCoordId(Long coordId);
}
