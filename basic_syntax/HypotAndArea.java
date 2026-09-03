package basic_syntax;
import java.util.Scanner;

public class HypotAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side A:");
        double sideA = scanner.nextDouble();
        System.out.print("Enter the side B:");
        double sideB = scanner.nextDouble();

        if(sideA<=0 || sideB<=0){
            System.out.println("Sides must be positive numbers");
        }else{
            double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
            double area = (sideA * sideB) / 2;

            System.out.println("The hypotenuse is: " + Math.round(hypotenuse * 100.0) / 100.0);
            System.out.println("The area is: " + area);

            if(hypotenuse > 50){
                System.out.println("Classification: Large Triangle");
            }else{
                System.out.println("Classification: Standard Triangle");
            }
        }

        
        scanner.close();
    }
}
