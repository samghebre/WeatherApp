package com.samghebremedhin.WeatherApp.implementations;

import com.samghebremedhin.WeatherApp.exceptions.DataNotFoundException;
import com.samghebremedhin.WeatherApp.model.City;
import com.samghebremedhin.WeatherApp.repository.CityRepository;
import com.samghebremedhin.WeatherApp.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;
    @Override
    public City createCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<City> getAllCities() {
        return this.cityRepository.findAll();
    }

    @Override
    public City getCityById(long id) {
        Optional<City> cityData = this.cityRepository.findById(id);

        if(cityData.isPresent()){
            return cityData.get();
        }else{
            throw new DataNotFoundException("No records found with this id : " + id);
        }
    }
}
