package com.samghebremedhin.WeatherApp.service;

import com.samghebremedhin.WeatherApp.model.Coord;

import java.util.List;

public interface CoordService {
    List<Coord> getAllCoord();

    Coord getCoordById(long id);
}
