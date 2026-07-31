package io.github.hientuenguyen.carmaintenancetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;
    private String make;
    private String model;
    private int currMileage;

    @Column(unique = true)
    private String vin;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    public Vehicle() {

    }

    //Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public User getOwner() { return owner; }
    public void setOwner(User owner) { this.owner = owner; }

    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }

    public int getCurrMileage() { return currMileage; }
    public void setCurrMileage(int currMileage) { this.currMileage = currMileage; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    private String displayVehicle(int year, String make, String model, int mileage, String vin) {
        return year + " " + make + " " + model + " " + mileage + " " + vin;
    }
}
