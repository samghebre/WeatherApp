package com.samghebremedhin.WeatherApp.service;

import com.samghebremedhin.WeatherApp.model.WeatherResponse;

import java.util.List;

public interface WeatherService {


    List<WeatherResponse> getAllWeather();

    WeatherResponse getWeatherById(long id);
//    WeatherResponse getWeatherByCityName(String cityName);
    WeatherResponse getWeatherByCoordId(Long id);


}
