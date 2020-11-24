package com.assessment.weather.Service.Impl;

import com.assessment.weather.DTO.*;
import com.assessment.weather.Service.FetchDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FetchDetailsImpl implements FetchDetails {

    @Override
    public List<ListDTO> fetchData() {
        RestTemplate restTemplate = new RestTemplate();
        RootDTO rootData = restTemplate.getForObject(
                "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22", RootDTO.class);
        List<ListDTO> weatherList = new ArrayList<>();
        weatherList = rootData.getList();
        return weatherList;
    }

    @Override
    public String maxTempDate() {
        List<ListDTO> weatherList = new ArrayList<>();
        double maxTemperature = 0;
        double dayTemp = 0;
        String maxTempDate = null;
        weatherList = fetchData();
        for (ListDTO list : weatherList) {
            MainDTO dayData = new MainDTO();
            dayTemp = list.getMain().getTemp_max();
            if (dayTemp > maxTemperature) {
                maxTemperature = dayTemp;
                maxTempDate = list.getDt_txt();
            }
        }
        return maxTempDate;
    }

   @Override
    public List<String> findRainyDays(){
       List<ListDTO> weatherList = new ArrayList<>();
       weatherList = fetchData();
       List<String> rainyDays = new ArrayList<>();
       for (ListDTO list : weatherList) {
           for (WeatherDTO weatherDTO:list.getWeather()) {
               if(weatherDTO.getMain().equalsIgnoreCase("Rain")){
                   rainyDays.add(list.getDt_txt());
               }
           }
       }
       return rainyDays;
   }

   @Override
   public WeatherDetailsDTO findDayWeather(String date){
       List<ListDTO> weatherList = new ArrayList<>();
       weatherList = fetchData();
       WeatherDetailsDTO dayWeather = new WeatherDetailsDTO();
       for (ListDTO list : weatherList) {
         if(list.getDt_txt().equalsIgnoreCase(date)){
             dayWeather.setHumidity(list.getMain().getHumidity());
             dayWeather.setTemp_max(list.getMain().getTemp_max());
             dayWeather.setTemp_min(list.getMain().getTemp_min());
             dayWeather.setMain(list.getWeather().get(0).getMain());
         }
       }
       return dayWeather;
   }
}
