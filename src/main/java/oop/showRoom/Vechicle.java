package oop.showRoom;

public abstract class Vechicle {

    private String brand;
    private String model;
    private String color;
    private String engine;
    private double millage;
    private String gearBoxType;
    private boolean isUsed;

    public Vechicle(String brand, String model, String color, String engine, double millage, String gearBoxType, boolean isUsed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.millage = millage;
        this.gearBoxType = gearBoxType;
        this.isUsed = isUsed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setMillage(double millage) {
        this.millage = millage;
    }

    public void setGearBoxType(String gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public double getMillage() {
        return millage;
    }

    public String getGearBoxType() {
        return gearBoxType;
    }

    public boolean isUsed() {
        return isUsed;
    }
}
