package io.github.hientuenguyen.carmaintenancetracker.repository;

import io.github.hientuenguyen.carmaintenancetracker.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    boolean existsByVin(String vin); /*Spring parses the method name and implements it. In this
    Spring reads it as exists, which is to return a boolean, By, which means a condition, and Vin
    which is the condition*/
}
