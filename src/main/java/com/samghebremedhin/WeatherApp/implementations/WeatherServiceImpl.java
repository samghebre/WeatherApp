package com.samghebremedhin.WeatherApp.implementations;

import com.samghebremedhin.WeatherApp.exceptions.DataNotFoundException;
import com.samghebremedhin.WeatherApp.model.Weather;
import com.samghebremedhin.WeatherApp.repository.WeatherRepository;
import com.samghebremedhin.WeatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    @Override
    public List<Weather> getAllWeather() {
        return this.weatherRepository.findAll();
    }

    @Override
    public Weather getWeatherById(long id) {
        Optional<Weather> weatherIdData = this.weatherRepository.findById(id);

        if(weatherIdData.isPresent()){
            return weatherIdData.get();
        }else{
            throw new DataNotFoundException("Data not found with this id : " + id);
        }
    }

    @Override
    public Weather getWeatherByCityName(String cityName) {
        Optional<Weather> cityData = this.weatherRepository.findByCityName(cityName);

        if(cityData.isPresent()){
            return cityData.get();
        }else{
            throw new DataNotFoundException("Data not found with this id : " + cityName);
        }

    }

    @Override
    public Weather getWeatherByCoordId(Long id) {
        Optional<Weather> coordinate = this.weatherRepository.findByCoordId(id);

        if(coordinate.isPresent()){
            return coordinate.get();
        }else{
            throw new DataNotFoundException("Data not found with this id : " + id);
        }

    }
}

