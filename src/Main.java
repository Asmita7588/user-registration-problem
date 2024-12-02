import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration System");

        Scanner scanner = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter User Mobile Number: ");
        String mobileNumber = scanner.nextLine();

        if (userRegistration.isValidMobileNumber(mobileNumber)) {

            System.out.println("Mobile Number is valid.");
        } else {
            System.out.println("Invalid Mobile Number, Please enter the format e.g 91 7588742638");
        }

        scanner.close();
    }

    }


