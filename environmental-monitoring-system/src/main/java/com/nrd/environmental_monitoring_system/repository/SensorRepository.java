package com.nrd.environmental_monitoring_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nrd.environmental_monitoring_system.model.SensorData;

@Repository
public interface SensorRepository extends JpaRepository<SensorData, Long> {
}
