import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight Converter");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");

        System.out.println("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.println("Enter the weight: ");
        double weight = scanner.nextDouble();

        if (choice == 1) {
            double pounds = weight * 2.20462;
            System.out.println(weight + " kilograms is equal to " + pounds + " pounds.");
        } else if (choice == 2) {
            double kilograms = weight / 2.20462;
            System.out.println(weight + " pounds is equal to " + kilograms + " kilograms.");
        } else {
            System.out.println("Invalid choice. Please select either 1 or 2.");
        }
        scanner.close();
    }
}
