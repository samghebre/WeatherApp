package com.samghebremedhin.WeatherApp.controllers;

import com.samghebremedhin.WeatherApp.model.City;
import com.samghebremedhin.WeatherApp.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/city")
    public ResponseEntity<List<City>>getAllCity(){
        return ResponseEntity.ok().body(cityService.getAllCities());
    }

   @GetMapping("/city/{id}")
    public ResponseEntity<City> getCityById(@PathVariable long id){
        return ResponseEntity.ok().body(this.cityService.getCityById(id));
    }
}
