package com.samghebremedhin.WeatherApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="coord")
@Entity
public class Coord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double lon;
    private Double lat;

    public Coord() {
    }

    public Coord(Long id, Double lon, Double lat) {
        this.id = id;
        this.lon = lon;
        this.lat = lat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Coord{" +
                "id=" + id +
                ", lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}
