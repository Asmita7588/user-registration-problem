package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        UserValidator userValidator = new UserValidator();
        userValidator.validateUserDetails("Name","Lastame","girhepunje@gmail.com","91 7588742638","Pass@123");



    }
}
