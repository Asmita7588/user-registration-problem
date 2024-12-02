import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration System");

        Scanner scanner = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter User Last Name: ");
        String lastName = scanner.nextLine();

        if (userRegistration.isValidLastName(lastName)) {

            System.out.println("Last Name is valid.");
        } else {
            System.out.println("Invalid Last Name,It must start with a capital letter and have at least 3 characters.");
        }

        scanner.close();
    }

    }


