package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        UserValidator userValidator = new UserValidator();
        System.out.print("Enter First Name = ");
        String firstName = scanner.nextLine();
        boolean isValidFirstName = userValidator.validateFirstName(firstName);

        if(isValidFirstName)
            System.out.println("Happy Test");
        else
            System.out.println("Sad Test");

    }
}
