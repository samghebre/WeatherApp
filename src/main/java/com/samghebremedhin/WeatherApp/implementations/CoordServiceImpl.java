package com.samghebremedhin.WeatherApp.implementations;

import com.samghebremedhin.WeatherApp.exceptions.DataNotFoundException;
import com.samghebremedhin.WeatherApp.model.Coord;
import com.samghebremedhin.WeatherApp.repository.CoordRepository;
import com.samghebremedhin.WeatherApp.service.CoordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoordServiceImpl implements CoordService {
    @Autowired
    private CoordRepository coordRepository;

    @Override
    public List<Coord> getAllCoord() {
        return this.coordRepository.findAll();
    }

    @Override
    public Coord getCoordById(long id) {
        Optional<Coord> coordData = this.coordRepository.findById(id);
        if (coordData.isPresent()) {
            return coordData.get();
        } else {
            throw new DataNotFoundException("Record not found with this coordinate : " + id);
        }
    }
}
