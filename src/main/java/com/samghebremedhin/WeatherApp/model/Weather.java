package com.samghebremedhin.WeatherApp.model;

import javax.persistence.*;

@Table(name="weather")
@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Main main;
    @OneToOne
    private Coord coord;
    private String description;
    private String cityName;



    public Weather() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
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
                ", main=" + main +
                ", coord=" + coord +
                ", description='" + description + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
