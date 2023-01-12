package oop.showroom.service;

import oop.showroom.model.Vehicle;

public interface VehicleService {

    void adVehicle(Vehicle vehicle);

    Vehicle[] getAllVehicles();

}
