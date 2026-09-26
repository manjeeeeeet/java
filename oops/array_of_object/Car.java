package oops.array_of_object;

public class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void drive(){
        System.out.println("Car running: " + model);
    }
}
