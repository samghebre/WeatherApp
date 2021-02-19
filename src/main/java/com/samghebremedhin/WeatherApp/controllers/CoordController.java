package com.samghebremedhin.WeatherApp.controllers;


import com.samghebremedhin.WeatherApp.model.Coord;
import com.samghebremedhin.WeatherApp.service.CoordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoordController {

    @Autowired
    private CoordService coordService;

    @GetMapping("/coordinate")
    public ResponseEntity<List<Coord>> getAllCoord(){
        return ResponseEntity.ok().body(coordService.getAllCoord());
    }

    @GetMapping("/cordinate/{id}")
    public ResponseEntity<Coord> getCoordById(@PathVariable long id){
        return ResponseEntity.ok().body(this.coordService.getCoordById(id));
    }
}
