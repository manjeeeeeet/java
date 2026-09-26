package oops.array_of_object;

public class main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("hundai", "i20", 2025),
            new Car("suzuki", "brezza", 2020),
            new Car("ford", "mustang", 2015)
        };

        for(Car car : cars){
            System.out.println(car.brand + " - " + car.model + " - " + car.year);
           
        }
    }
}
