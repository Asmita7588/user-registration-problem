package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

        UserValidator validator = new UserValidator();

        @Test
        void testFirstName_HappyCase() {

            validator.validateFirstName("Asmita");
        }

        @Test
        void testFirstName_SadCase() {
            assertThrows( InvalidFirstNameExceptions.class, () -> {
                validator.validateFirstName("john");
            });
            assertThrows( InvalidFirstNameExceptions.class, () -> {
                validator.validateFirstName("jo");
            });
            assertThrows( InvalidFirstNameExceptions.class, () -> {
                validator.validateFirstName("j0hn");
            });

        }



        @Test
        void testLastName_HappyCase() {
            validator.validateLastName("Doe");
        }

        @Test
        void testLastName_SadCase() {
            assertThrows( InvalidLastNameExceptions.class, () ->validator.validateLastName("doe"));
            assertThrows(InvalidLastNameExceptions.class, () ->validator.validateLastName("D"));
            assertThrows(InvalidLastNameExceptions.class,() ->validator.validateLastName("Doe1"));
        }

        @Test
        void testEmail_HappyCase() {
            validator.validateEmail("abc@yahoo.com");
            validator.validateEmail("abc-100@yahoo.com");
            validator.validateEmail("abc.100@yahoo.com");
        }

        @Test
        void testEmail_SadCase() {
            assertThrows(InvalidEmailExceptions.class,() ->validator.validateEmail("abc"));                   // missing '@'
            assertThrows(InvalidEmailExceptions.class,() ->validator.validateEmail("abc@.com.my"));           // tld starts with '.'
            assertThrows(InvalidEmailExceptions.class,() ->validator.validateEmail("abc123@gmail.a"));        // invalid tld
            assertThrows(InvalidEmailExceptions.class,() ->validator.validateEmail("abc@abc@gmail.com"));     // multiple '@'
            assertThrows(InvalidEmailExceptions.class,() ->validator.validateEmail("abc@gmail.com.1a"));      // tld with digit
        }

        @Test
        void testMobile_HappyCase() {
            validator.validateMobile("91 9919819801");
            validator.validateMobile("1 1234567890");
        }

        @Test
        void testMobile_SadCase() {
            assertThrows(InvalidMobileNumberExceptions.class,() ->validator.validateMobile("919919819801"));
            assertThrows(InvalidMobileNumberExceptions.class,() ->validator.validateMobile("91 991981980"));
            assertThrows(InvalidMobileNumberExceptions.class,() ->validator.validateMobile("+91 9919819801"));
        }

        @Test
        public void testPassword_HappyCase() {
            validator.validatePassword("Password@123");
            validator.validatePassword("Secure@2023");
        }


        @Test
        void testPassword_SadCase() {
            assertThrows(InvalidPasswordExceptions.class,() ->validator.validatePassword("password"));
            assertThrows(InvalidPasswordExceptions.class,() ->validator.validatePassword("PASSWORD"));
            assertThrows(InvalidPasswordExceptions.class,() ->validator.validatePassword("Pass@"));
            assertThrows(InvalidPasswordExceptions.class,() ->validator.validatePassword("Pass1234"));
        }

        //ParameterizedTest
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "Abc+100@gmail.com"
    })
    void testValidEmails(String email) {
        validator.validateEmail(email);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a"
    })
    void testInvalidEmails(String email) {
        assertThrows(InvalidPasswordExceptions.class,() ->validator.validateEmail(email), "Email should be invalid: " + email);
    }


    }

