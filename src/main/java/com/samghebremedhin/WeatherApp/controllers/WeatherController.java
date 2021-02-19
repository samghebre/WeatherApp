package com.samghebremedhin.WeatherApp.controllers;

import com.samghebremedhin.WeatherApp.model.Weather;
import com.samghebremedhin.WeatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public ResponseEntity<List<Weather>> getAllWeather(){
        return ResponseEntity.ok().body(weatherService.getAllWeather());
    }

    @GetMapping("/weather/{id}")
    public ResponseEntity<Weather> getWeatherById(@PathVariable long id){
        return ResponseEntity.ok().body(this.weatherService.getWeatherById(id));
    }

    @GetMapping("/weather/{cityName}")
    public ResponseEntity<Weather> getWeatherByCityName(@PathVariable String cityName){
        return ResponseEntity.ok().body(this.weatherService.getWeatherByCityName(cityName));
    }

    @GetMapping("/coordinate/{coordId}")
    public ResponseEntity<Weather> getWeatherByCoordId(@PathVariable Long coordId){
        return ResponseEntity.ok().body(this.weatherService.getWeatherByCoordId(coordId));
    }

}
