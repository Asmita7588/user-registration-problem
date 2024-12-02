import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration System");

        Scanner scanner = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter User's Password: ");
        String password = scanner.nextLine();

        if (userRegistration.isValidPassword(password)) {

            System.out.println("Password is valid.");
        } else {
            System.out.println("Invalid Password , Please enter minimum 8 characters and 1 upper case letter,and 1 numeric digit");
        }

        scanner.close();
    }

    }


