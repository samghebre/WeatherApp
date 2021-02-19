package com.samghebremedhin.WeatherApp.repository;

import com.samghebremedhin.WeatherApp.model.Coord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordRepository extends JpaRepository<Coord, Long> {
}
