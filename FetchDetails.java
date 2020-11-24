package com.assessment.weather.Service;

import com.assessment.weather.DTO.ListDTO;
import com.assessment.weather.DTO.RootDTO;
import com.assessment.weather.DTO.WeatherDetailsDTO;

import java.util.List;

public interface FetchDetails {
    List<ListDTO> fetchData();
    String maxTempDate();
    List<String> findRainyDays();
    public WeatherDetailsDTO findDayWeather(String date);
}
