package io.github.hientuenguyen.carmaintenancetracker.service;

import io.github.hientuenguyen.carmaintenancetracker.model.Vehicle;
import io.github.hientuenguyen.carmaintenancetracker.repository.VehicleRepository;
import org.springframework.stereotype.Service;
import java.time.Year;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        validateVehicle(vehicle);

        return vehicleRepository.save(vehicle);
    }

    //Helper method used to confirm that a vehicle objects fields are not blank or null
    private void validateRequiredField(String value, String fieldName) {
        if (value == null || value.isBlank()) { throw new IllegalArgumentException(fieldName + " is required"); }
    }
    //Helper method used to confirm all fields of vehicle are validated
    private void validateVehicle(Vehicle vehicle) {
        validateRequiredField(vehicle.getVin(), "VIN"); //Validates there is a VIN
        validateRequiredField(vehicle.getMake(), "Make"); //Validates there is a make
        validateRequiredField(vehicle.getModel(), "Model"); //Validates there is a model
        //Validates if vehicle has non-negative mileage
        if (vehicle.getCurrMileage() < 0) { throw new IllegalArgumentException("Vehicle mileage cannot be negative"); }
        //Validates vehicles VIN length
        if (vehicle.getVin().length() != 17) { throw new IllegalArgumentException("Vehicles must have vin length of 17"); }
        //Validates there is no other vehicle object with same VIN before creating
        if (vehicleRepository.existsByVin(vehicle.getVin()) ) { throw new IllegalArgumentException("Vehicle with vin " + vehicle.getVin() + " already exists"); }
        //Provides most current production year for vehicles
        int maxYear = Year.now().getValue()+1;
        //Validates vehicles year
        if(maxYear < vehicle.getYear() || vehicle.getYear() < 1886) { throw new IllegalArgumentException("Vehicles year must be between 1886 and " + maxYear); }
    }
}
