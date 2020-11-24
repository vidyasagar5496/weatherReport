package com.assessment.weather.DTO;

import java.util.List;

public class RootDTO {
    public String cod;
    public double message;
    public int cnt;
    public List<ListDTO> list;
    public CityDTO city;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<ListDTO> getList() {
        return list;
    }

    public void setList(List<ListDTO> list) {
        this.list = list;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }
}
