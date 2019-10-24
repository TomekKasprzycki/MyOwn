package pl.coderslab.model;

import pl.coderslab.abstractClasses.Vehicle;
import pl.coderslab.interfaces.Fault;
import pl.coderslab.interfaces.VehicleActions;

public class Car extends Vehicle implements Fault, VehicleActions {

    private String brand;
    private String model;

    public Car(String type, String name, int speed, String model, String brand) {
        super(type, name, speed);
        this.model = model;
        this.brand = brand;
    }

    public Car(String type, String name, int speed) {
        super(type, name, speed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void checkForFault() {
        System.out.println("Car checked: no fault found!");
    }

    @Override
    public void toot() {
        System.out.println("Car makes toot!");
    }

    @Override
    public void speedUp() {
        System.out.println("Car speed up!");
    }

    @Override
    public void slowDown() {
        System.out.println("Car slow down");
    }

    public void turn() {
        System.out.println("Car turns");
    }
}
