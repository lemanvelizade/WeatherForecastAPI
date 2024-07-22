package org.example.weatherforecastapi.service;

import org.example.weatherforecastapi.model.WeatherRequest;
import org.example.weatherforecastapi.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private static final String API_KEY = "dc0467433765edf90f374164a0379d75";
    private static final String BASE_URL = "http://api.weatherapi.com/v1";


    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getDailyWeather(WeatherRequest request) {
        String url = String.format("%s/forecast.json?key=%s&q=%s,%s&days=1", BASE_URL, API_KEY, request.getCity(), request.getCountry());
        return callWeatherApi(url);
    }

    public WeatherResponse getWeeklyWeather(WeatherRequest request) {
        String url = String.format("%s/forecast.json?key=%s&q=%s,%s&days=7", BASE_URL, API_KEY, request.getCity(), request.getCountry());
        return callWeatherApi(url);
    }

    public WeatherResponse getMonthlyWeather(WeatherRequest request) {
        String url = String.format("%s/forecast.json?key=%s&q=%s,%s&days=30", BASE_URL, API_KEY, request.getCity(), request.getCountry());
        return callWeatherApi(url);
    }

    private WeatherResponse callWeatherApi(String url) {

        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}