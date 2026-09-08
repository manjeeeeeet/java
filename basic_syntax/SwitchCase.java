import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                System.out.println("It is a weekday😭");
            case "saturday", "sunday" ->
                System.out.println("It is a weekend😍");
            default ->
                System.out.println("Is not a valid day");
        }

        scanner.close();
    }
}