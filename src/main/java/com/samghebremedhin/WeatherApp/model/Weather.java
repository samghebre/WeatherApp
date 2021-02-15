package com.samghebremedhin.WeatherApp.model;

import java.util.Date;

public class Weather {
    private Date currentDate;
    private Double temperature;
    private Double precipitation;
    private Double humidity;
    private Double windSpeed;
    private Long cityId;
    private String cityName;

    City city = new City();

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Double precipitation) {
        this.precipitation = precipitation;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "currentDate=" + currentDate +
                ", temperature=" + temperature +
                ", precipitation=" + precipitation +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", city=" + city +
                '}';
    }
}
