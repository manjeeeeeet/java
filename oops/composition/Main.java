package oops.composition;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW M3",2024,"Inline-6");
        Car car2 = new Car("Audi RS5",2024,"v6");

        car1.start();
        System.out.println(car1.name + " " + car1.year + " "+ car1.engine.type);

        car2.start();
        System.out.println(car2.name + " " + car2.year + " "+ car2.engine.type);
    }
}
