package org.example;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.inventory = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Inventory
    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(inventory);
    }
    void addVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            inventory.add(vehicle);
        }
    }
    void removeVehicle(int vin) {
        Vehicle vehicleToRemove = null;
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVin() == vin) {
                vehicleToRemove = vehicle;
                break;
            }
        }
        if (vehicleToRemove != null) {
            inventory.remove(vehicleToRemove);
        }
    }
    public List<Vehicle> getVehicleByPrice(double minPrice, double maxPrice) {
        List<Vehicle> filteredByPrice = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= minPrice || vehicle.getPrice() <= maxPrice) {
                filteredByPrice.add(vehicle);
            }
        }
        return filteredByPrice;
    }
    public List<Vehicle> getVehicleByMakeModel(String make, String model) {
        List<Vehicle> filteredByMakeModel = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) || vehicle.getModel().equalsIgnoreCase(model)) {
                filteredByMakeModel.add(vehicle);
            }
        }
        return filteredByMakeModel;
    }
    public List<Vehicle> getVehicleByYear(int min, int max) {
        List<Vehicle> filteredByYear = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min || vehicle.getYear() <= max) {
                filteredByYear.add(vehicle);
            }
        }
        return filteredByYear;
    }
    public List<Vehicle> getVehicleByColor(String color) {
        List<Vehicle> filteredByColor = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                filteredByColor.add(vehicle);
            }
        }
        return filteredByColor;
    }
    public List<Vehicle> getVehicleByMileage(int min, int max) {
        List<Vehicle> filteredByOdometer = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min || vehicle.getOdometer() <= max) {
                filteredByOdometer.add(vehicle);
            }
        }
        return filteredByOdometer;
    }
    public List<Vehicle> getVehicleByType(String vehicleType) {
        List<Vehicle> filteredByType = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                filteredByType.add(vehicle);
            }
        }
        return filteredByType;
    }

}
