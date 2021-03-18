package com.samghebremedhin.WeatherApp.implementations;

import com.samghebremedhin.WeatherApp.exceptions.DataNotFoundException;
import com.samghebremedhin.WeatherApp.model.WeatherResponse;
import com.samghebremedhin.WeatherApp.repository.WeatherResponseRepository;
import com.samghebremedhin.WeatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherResponseRepository weatherRepository;

    @Override
    public List<WeatherResponse> getAllWeather() {
        return this.weatherRepository.findAll();
    }

    @Override
    public WeatherResponse getWeatherById(long id) {
        Optional<WeatherResponse> weatherIdData = this.weatherRepository.findById(id);

        if(weatherIdData.isPresent()){
            return weatherIdData.get();
        }else{
            throw new DataNotFoundException("Data not found with this id : " + id);
        }
    }
//      @Override
//    public WeatherResponse getWeatherByCityName(String cityName) {
//        Optional<WeatherResponse> cityData = this.weatherRepository.findByCityName(cityName);
//
//        if(cityData.isPresent()){
//            return cityData.get();
//       }else{
//            throw new DataNotFoundException("Data not found with this id : " + cityName);
//        }
//
//    }

    @Override
    public WeatherResponse getWeatherByCoordId(Long id) {
        Optional<WeatherResponse> coordinate = this.weatherRepository.findByCoordId(id);

        if(coordinate.isPresent()){
            return coordinate.get();
        }else{
            throw new DataNotFoundException("Data not found with this id : " + id);
        }

    }
}

