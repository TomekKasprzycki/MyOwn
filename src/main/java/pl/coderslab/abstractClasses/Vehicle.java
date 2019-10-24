package pl.coderslab.abstractClasses;

public abstract class Vehicle {
    private String type;
    private String name;
    private int speed;

    public Vehicle(String type, String name, int speed) {
        this.type = type;
        this.name = name;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
