package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        UserValidator userValidator = new UserValidator();
        try {
            userValidator.validateFirstName("Asmita");
            userValidator.validateLastName("Girhepunje");
            userValidator.validateMobile("91 7588757774");
            userValidator.validateEmail("Pass2@43gmail.com");
            userValidator.validatePassword("Pass2@43");
        }catch (InvalidFirstNameExceptions | InvalidLastNameExceptions
                |InvalidEmailExceptions |InvalidMobileNumberExceptions |InvalidPasswordExceptions e){
            System.out.println(e);
        }



    }
}
