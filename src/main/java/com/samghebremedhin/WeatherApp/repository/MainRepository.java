package com.samghebremedhin.WeatherApp.repository;

import com.samghebremedhin.WeatherApp.model.Main;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainRepository extends JpaRepository<Main, Double> {
}
