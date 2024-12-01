import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration System");

        Scanner scanner = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter User First Name: ");
        String firstName = scanner.nextLine();

        if (userRegistration.isValidfirstName(firstName)) {

            System.out.println("First Name is valid.");
        } else {
            System.out.println("Invalid First Name! It must start with a capital letter and have at least 3 characters.");
        }

        scanner.close();
    }

    }


