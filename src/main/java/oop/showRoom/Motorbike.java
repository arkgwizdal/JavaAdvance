package oop.showRoom;

public class Motorbike extends Vechicle {
    private String motorbikeType;
    private String motorbikeDrive;


    public Motorbike(String brand, String model, String color, String engine, double millage, String gearBoxType, boolean isUsed, String motorbikeType, String motorbikeDrive) {
        super(brand, model, color, engine, millage, gearBoxType, isUsed);
        this.motorbikeType = motorbikeType;
        this.motorbikeDrive = motorbikeDrive;
    }
}
