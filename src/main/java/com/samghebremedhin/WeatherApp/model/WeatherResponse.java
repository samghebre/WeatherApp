package com.samghebremedhin.WeatherApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;

@JsonIgnoreProperties
public class WeatherResponse {

    private Weather[] weathers;

    public Weather[] getWeathers() {
        return weathers;
    }

    public void setWeathers(Weather[] weathers) {
        this.weathers = weathers;
    }
}
