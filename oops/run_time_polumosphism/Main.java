package oops.run_time_polumosphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal;

        System.out.print("Would you like a dog or cat? (1 = dog, 2 = cat): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        }else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }else{
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
