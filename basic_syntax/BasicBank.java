import java.util.Scanner;

public class BasicBank {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nVault Bank");
            System.out.println("──────────");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("\nChoose: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance(balance);
                    break;
                case 2:
                    balance = balance - withdrawMoney(balance);
                    break;
                case 3:
                    balance = balance + depositMoney();
                    break;
                case 4:
                    isRunning = exitBank();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }

    static void checkBalance(double balance) {
        System.out.println("\nBalance");
        System.out.println("───────");
        System.out.printf("$%.2f%n", balance);

    }

    static double depositMoney() {
        System.out.println("\nDeposit");
        System.out.println("───────");
        System.out.print("Amount: $");

        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative.");
            return 0;
        } else {
            System.out.printf("Deposited $%.2f%n", amount);
            return amount;
        }
    }

    static double withdrawMoney(double balance) {
        System.out.println("\nWithdraw");
        System.out.println("────────");
        System.out.print("Amount: $");

        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Withdrawal amount cannot be zero or negative.");
            return 0;
        }

        if (balance < amount) {
            System.out.println("Insufficient funds.");
            System.out.printf("Balance: $%.2f%n", balance);

            return 0;
        } else {
            System.out.printf("Withdrawn $%.2f%n", amount);
            return amount;
        }
    }

    static boolean exitBank() {
        System.out.print("\nExit? (yes/no): ");

        String response = scanner.next();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("\nThanks for using Basic Bank.");
            System.out.println("Have a great day.");
            return false;
        } else {
            return true;
        }

    }

}