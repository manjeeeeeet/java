package oops.toString;

public class Car {
    String brand;
    String model;
    String color;
    int year;

    Car(String brand, String model, String color, int year){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String toString() {
        return this.brand + " " + this.model + " " + this.color + " " + this.year;
    }
}
