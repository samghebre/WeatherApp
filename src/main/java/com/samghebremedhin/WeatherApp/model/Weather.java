package com.samghebremedhin.WeatherApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Table(name="weather")
@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonIgnore
    @ManyToOne()
    private WeatherResponse weatherResponse;
    private String description;
    @JsonIgnore
    private String cityName;



    public Weather() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                "id=" + id +
                ", description='" + description + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
