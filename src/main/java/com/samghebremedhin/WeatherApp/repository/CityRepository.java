package com.samghebremedhin.WeatherApp.repository;

import com.samghebremedhin.WeatherApp.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
