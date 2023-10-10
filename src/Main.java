import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Car car = new Car("Lexus", "RX350", "GOLD", 4);
    Plane plane = new Plane("Boeing", "737", "WHITE AND BLUE", 2, 4);
    plane.move();
    plane.stop();

    car.move();
    car.stop();

    }
}


class Vehicle {
    private String name;
    private String model;

    public Vehicle(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void move () {
        System.out.println("The vehicle " + this.name + " has started.");
    }
    public void stop () {
        System.out.println("The vehicle " + this.name + " has stopped.");
    }
}


class Car extends Vehicle{
    private String color;
    private int doors;

    public Car(String name, String model, String color, int doors) {
        super(name, model);
        this.color = color;
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println("Moving by Driving.");
        super.move();
    }
}

class Plane extends Vehicle{
    private String color;
    private int doors;
    private int engines;

    public Plane(String name, String model, String color, int doors, int engines) {
        super(name, model);
        this.color = color;
        this.doors = doors;
        this.engines = engines;
    }


    }
