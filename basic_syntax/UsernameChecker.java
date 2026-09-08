import java.util.Scanner;

public class UsernameChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Error: Username must be between 4 and 12 characters.");
        }else if(username.contains(" ") || username.contains("_")){
            System.out.println("Error: Username cannot contain spaces or underscores.");
        }else{
            System.out.println("welcome " + username);
        }



        scanner.close();
    }
}
