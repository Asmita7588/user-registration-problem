import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration System");

        Scanner scanner = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter User Email Address: ");
        String email = scanner.nextLine();

        if (userRegistration.isValidEmail(email)) {

            System.out.println("Email is valid.");
        } else {
            System.out.println("Invalid Email, Please enter the format abc.xyz@bl.co.in");
        }

        scanner.close();
    }

    }


