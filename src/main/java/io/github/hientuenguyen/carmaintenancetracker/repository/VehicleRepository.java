package io.github.hientuenguyen.carmaintenancetracker.repository;

import io.github.hientuenguyen.carmaintenancetracker.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

}
