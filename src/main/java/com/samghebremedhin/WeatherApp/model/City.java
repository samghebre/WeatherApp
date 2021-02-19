package com.samghebremedhin.WeatherApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Table(name="city")
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cityName;
    private String zipCode;

    public Long getCityId() {
        return id;
    }

    public void setCityId(Long cityId) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + id +
                ", cityName='" + cityName + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
   }

}
