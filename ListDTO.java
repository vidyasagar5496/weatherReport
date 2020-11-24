package com.assessment.weather.DTO;

import java.util.List;

public class ListDTO {
    public int dt;
    public MainDTO main;
    public List<WeatherDTO> weather;
    public CloudsDTO clouds;
    public WindDTO wind;
    public SysDTO sys;
    public String dt_txt;

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public MainDTO getMain() {
        return main;
    }

    public void setMain(MainDTO main) {
        this.main = main;
    }

    public List<WeatherDTO> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherDTO> weather) {
        this.weather = weather;
    }

    public CloudsDTO getClouds() {
        return clouds;
    }

    public void setClouds(CloudsDTO clouds) {
        this.clouds = clouds;
    }

    public WindDTO getWind() {
        return wind;
    }

    public void setWind(WindDTO wind) {
        this.wind = wind;
    }

    public SysDTO getSys() {
        return sys;
    }

    public void setSys(SysDTO sys) {
        this.sys = sys;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }
}
