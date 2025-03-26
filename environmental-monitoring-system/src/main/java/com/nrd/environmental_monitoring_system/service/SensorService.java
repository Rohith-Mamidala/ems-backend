package com.nrd.environmental_monitoring_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nrd.environmental_monitoring_system.model.SensorData;
import com.nrd.environmental_monitoring_system.repository.SensorRepository;

@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    public List<SensorData> getAllSensorData() {
        return sensorRepository.findAll();
    }

    public SensorData saveSensorData(SensorData sensorData) {
        return sensorRepository.save(sensorData);
    }
}
