package oops.polymorphism;

public class Car implements Vehicle {
    @Override 
    public void go() {
        System.out.println("you drive a car");
    }
}
