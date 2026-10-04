package oops.toString;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "red", "Corolla", 2020);
        Car car2 = new Car("Honda", "blue", "Civic", 2019);

        // System.out.println(car1.brand +" " + car1.model + " " + car1.color + " " + car1.year);
        System.out.println(car2);
    }
}
