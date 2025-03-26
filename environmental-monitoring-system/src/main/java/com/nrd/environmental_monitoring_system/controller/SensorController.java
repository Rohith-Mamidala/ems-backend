package com.nrd.environmental_monitoring_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nrd.environmental_monitoring_system.model.SensorData;
import com.nrd.environmental_monitoring_system.service.SensorService;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @GetMapping
    public List<SensorData> getAllSensorData() {
        return sensorService.getAllSensorData();
    }

    @PostMapping
    public SensorData saveSensorData(@RequestBody SensorData sensorData) {
        return sensorService.saveSensorData(sensorData);
    }
}