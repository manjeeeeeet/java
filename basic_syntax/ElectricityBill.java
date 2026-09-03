package basic_syntax;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        double units = scanner.nextDouble();
        double billAmt = 0;

        if(units <= 0){
            System.out.println("Units must be a positive number");
        }else if(units <= 100){
            billAmt = units * 4.0;
        }else if(units <= 200){
            billAmt = (100 * 4.0) + ((units - 100) * 6.0);
        }else {
            billAmt = (100 * 4.0) + (100 * 6.0) + ((units - 200) * 8.0);
        }
        
        if (billAmt > 1000) {
                billAmt += billAmt * 0.10; // Add 10% surcharge
                System.out.println("A 10% surcharge was applied.");
        }

        System.out.printf("The electricity bill amount is: %.2f\n", billAmt);
        scanner.close();
    }

}
