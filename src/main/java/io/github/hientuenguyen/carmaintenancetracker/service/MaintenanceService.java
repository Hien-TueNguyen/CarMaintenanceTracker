package io.github.hientuenguyen.carmaintenancetracker.service;

import io.github.hientuenguyen.carmaintenancetracker.repository.VehicleRepository;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceService {
    private final VehicleRepository vehicleRepository;
    public MaintenanceService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
}
