import java.util.Scanner;

public class QuadrantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x-coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter the y-coordinate: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") is in Quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") is in Quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") is in Quadrant III.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") is in Quadrant IV.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point (" + x + ", " + y + ") is at the origin.");
        } else if (x == 0) {
            System.out.println("The point (" + x + ", " + y + ") is on the Y-axis.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is on the X-axis.");
        }

        scanner.close();

    }
}
