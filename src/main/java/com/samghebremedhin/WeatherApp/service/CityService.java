package com.samghebremedhin.WeatherApp.service;

import com.samghebremedhin.WeatherApp.model.City;

import java.util.List;

public interface CityService {

    City createCity(City city);

    List<City> getAllCities();

    City getCityById(long id);



}
