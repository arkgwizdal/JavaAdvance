package oop.showroom;

import oop.showroom.model.Car;
import oop.showroom.model.Motorbike;
import oop.showroom.model.Vehicle;
import oop.showroom.model.enums.*;
import oop.showroom.repository.VehicleRepository;
import oop.showroom.service.VehicleService;
import oop.showroom.service.VehicleServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class ShowroomApp {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        ShowroomApp showroomApp = new ShowroomApp();
        showroomApp.run();
    }

    private void run() throws InterruptedException {
        VehicleService vehicleService = new VehicleServiceImpl();
        init(vehicleService);

        boolean on = true;
        System.out.println("Witaj w aplikacji salolu samochodowego");
        Thread.sleep(3000);
        while (on) {
            showMenu();
            int decysion = SCANNER.nextInt();

            switch (decysion) {
                case 0 -> {
                    on = false;
                    System.out.println("Koniec, dowidzenia !!!");
                }
                case 1 -> addCar(vehicleService);
                case 2 -> addMotorbike(vehicleService);
                case 3 -> showVehicles(vehicleService);
                default -> System.out.println("Nie ma takiej opracji ");
            }
        }
    }

    private void showMenu() {
        System.out.println("Jaką operację chcesz wykpnać? ");
        System.out.println(" 1 - Dodaj nowy samochód ");
        System.out.println(" 2 - Dodaj nowy motocykl ");
        System.out.println(" 3 - Wyświetl wszystkie pojazdy  ");
        System.out.println(" 0 - Zakończ Program ");
    }

    private void init(VehicleService vehicleService) {
        Car audi = new Car(BrandType.AUDI, ModelType.A4, ColourType.RED, EngineType.V8, 10000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "car-drive", 5,
                200, 5);
        Car citroen = new Car(BrandType.CITROEN, ModelType.A4, ColourType.RED, EngineType.V8, 10000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "car-drive", 5,
                200, 5);
        Motorbike bmw = new Motorbike(BrandType.BMW, ModelType.X6, ColourType.GREEN, EngineType.V8, 50000,
                GearboxType.AUTOMATIC, true, MotorbikeType.CHOPPER, "łańcuch");


        vehicleService.adVehicle(audi);
        vehicleService.adVehicle(bmw);
        vehicleService.adVehicle(citroen);
    }

    private void showVehicles(VehicleService vehicleService) throws InterruptedException {
        for (Vehicle vehicle : vehicleService.getAllVehicles()) {
            System.out.println(vehicle);
        }
        Thread.sleep(5000);
    }

    private void addCar(VehicleService vehicleService) {
        Car car = new Car();
        System.out.println("Podaj marekę : BMW, AUDI, CITROEN");
        String brand = SCANNER.next();
        car.setBrand(BrandType.valueOf(brand));
        System.out.println("Podaj liczbę drzwi:  ");
        int dorsNumber = SCANNER.nextInt();
        car.setDoorsNumber(dorsNumber);
        vehicleService.adVehicle(car);
    }

    private void addMotorbike(VehicleService vehicleService) {
        Motorbike motor = new Motorbike();
        System.out.println("Podaj marekę : BMW, AUDI, CITROEN");
        String motorBrand = SCANNER.next();
        motor.setBrand(BrandType.valueOf(motorBrand));
        System.out.println("Podaj model : CHOPPER, ENDURO");
        String type = SCANNER.next();
        motor.setModel(ModelType.valueOf(type));
        vehicleService.adVehicle(motor);
        System.out.println("Motocykl dodany ");
    }
}
