package org.example.weatherforecastapi.controller;

import org.example.weatherforecastapi.model.WeatherRequest;
import org.example.weatherforecastapi.model.WeatherResponse;
import org.example.weatherforecastapi.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {


    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/daily")
    public ResponseEntity<WeatherResponse> getDailyWeather(@Validated @RequestBody WeatherRequest request) {
        return ResponseEntity.ok(weatherService.getDailyWeather(request));
    }

    @GetMapping("/weekly")
    public ResponseEntity<WeatherResponse> getWeeklyWeather(@Validated @RequestBody WeatherRequest request) {
        return ResponseEntity.ok(weatherService.getWeeklyWeather(request));
    }

    @GetMapping("/monthly")
    public ResponseEntity<WeatherResponse> getMonthlyWeather(@Validated @RequestBody WeatherRequest request) {
        return ResponseEntity.ok(weatherService.getMonthlyWeather(request));
    }
}