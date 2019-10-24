package pl.coderslab.model;

import pl.coderslab.abstractClasses.Vehicle;
import pl.coderslab.interfaces.Fault;
import pl.coderslab.interfaces.VehicleActions;

public class Train extends Vehicle implements VehicleActions, Fault {

    private int voltage;

    public Train(String type, String name, int speed, int voltage) {
        super(type, name, speed);
        this.voltage = voltage;
    }

    public Train(String type, String name, int speed) {
        super(type, name, speed);
    }

    @Override
    public void checkForFault() {
        System.out.println("Train checked: no faults found!");
    }

    @Override
    public void toot() {
        System.out.println("Train makes toot");
    }

    @Override
    public void speedUp() {
        System.out.println("Train speed up!");
    }

    @Override
    public void slowDown() {
        System.out.println("Train is slowing down!");
    }
}
