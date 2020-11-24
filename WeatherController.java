package com.assessment.weather.Controller;


import com.assessment.weather.DTO.ListDTO;
import com.assessment.weather.DTO.RootDTO;
import com.assessment.weather.DTO.WeatherDetailsDTO;
import com.assessment.weather.Service.FetchDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/weather")
@Slf4j
public class WeatherController {

    @Autowired
    public FetchDetails fetchDetails;

    @GetMapping("getWeatherDetails")
    public WeatherDetailsDTO findWeatherByDate(@RequestParam String date) {
        return fetchDetails.findDayWeather(date);
    }

    @GetMapping("maxTemperatureDate")
    public String weatherData() {
       return fetchDetails.maxTempDate();
    }

    @GetMapping("rainyDays")
    public List<String> rainyDays(){
        return fetchDetails.findRainyDays();
    }

}
