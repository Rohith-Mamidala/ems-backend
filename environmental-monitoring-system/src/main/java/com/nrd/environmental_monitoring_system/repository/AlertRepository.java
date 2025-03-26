package com.nrd.environmental_monitoring_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nrd.environmental_monitoring_system.model.Alert;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {
}
