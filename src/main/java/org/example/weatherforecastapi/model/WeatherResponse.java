package org.example.weatherforecastapi.model;

import java.util.List;

public class WeatherResponse {
    private String city;
    private String country;
    private List<DailyWeather> dailyWeather;

    public static class DailyWeather {
        private String date;
        private String condition;
        private double temperature;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<DailyWeather> getDailyWeather() {
        return dailyWeather;
    }

    public void setDailyWeather(List<DailyWeather> dailyWeather) {
        this.dailyWeather = dailyWeather;
    }
}