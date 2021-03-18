package com.samghebremedhin.WeatherApp.controllers;

import com.samghebremedhin.WeatherApp.model.Weather;
import com.samghebremedhin.WeatherApp.model.WeatherResponse;
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
    public ResponseEntity<List<WeatherResponse>> getAllWeather(){
        return ResponseEntity.ok().body(weatherService.getAllWeather());
    }

    @GetMapping("/weather/{id}")
    public ResponseEntity<WeatherResponse> getWeatherById(@PathVariable long id){
        return ResponseEntity.ok().body(this.weatherService.getWeatherById(id));
    }
//    @GetMapping("/weather/{cityName}")
//    public ResponseEntity<WeatherResponse> getWeatherByCityName(@PathVariable String cityName){
//        return ResponseEntity.ok().body(this.weatherService.getWeatherByCityName(cityName));
//    }

    @GetMapping("/coordinate/{coordId}")
    public ResponseEntity<WeatherResponse> getWeatherByCoordId(@PathVariable Long coordId){
        return ResponseEntity.ok().body(this.weatherService.getWeatherByCoordId(coordId));
    }

}
