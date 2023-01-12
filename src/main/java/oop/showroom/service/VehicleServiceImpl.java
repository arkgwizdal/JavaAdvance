package oop.showroom.service;

import oop.showroom.model.Vehicle;
import oop.showroom.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {
    static int i = 0;

    @Override
    public void adVehicle(Vehicle vehicle) {
        VehicleRepository.vehicles[i] = vehicle;
        i++;
    }

    @Override
    public Vehicle[] getAllVehicles() {

        Vehicle[] tab = VehicleRepository.vehicles;
        int couter = 0;
        for (Vehicle v : tab) {
            if (v != null)
                couter++;
        }
        Vehicle[] result = new Vehicle[couter];

        int index = 0;
        for (Vehicle v : tab) {
            if (v != null) {
                result[index] = v;
                index++;
            }
        }
        return result;
    }
}
