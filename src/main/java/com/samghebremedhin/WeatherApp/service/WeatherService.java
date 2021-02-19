package com.samghebremedhin.WeatherApp.service;

import com.samghebremedhin.WeatherApp.model.Weather;

import java.util.List;

public interface WeatherService {


    List<Weather>getAllWeather();

    Weather getWeatherById(long weatherId);
    Weather getWeatherByCityName(String cityName);
    Weather getWeatherByCoordId(Long id);


}
