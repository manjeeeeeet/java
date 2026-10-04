import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Where you want to start the Countdown: ");

        int start = scanner.nextInt();

        for (int i = start; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("heyy pookie ><");

        scanner.close();
    }
}
