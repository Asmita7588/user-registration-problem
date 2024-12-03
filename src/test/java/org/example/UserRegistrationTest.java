package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegistrationTest {

        UserValidator validator = new UserValidator();

        @Test
        void testFirstName_HappyCase() {

            assertTrue(validator.validateFirstName("Asmita"));
        }

        @Test
        void testFirstName_SadCase() {
            assertFalse(validator.validateFirstName("john"));
            assertFalse(validator.validateFirstName("Jo"));
            assertFalse(validator.validateFirstName("J0hn"));
        }

        @Test
        void testLastName_HappyCase() {
            assertTrue(validator.validateLastName("Doe"));
        }

        @Test
        void testLastName_SadCase() {
            assertFalse(validator.validateLastName("doe"));
            assertFalse(validator.validateLastName("D"));
            assertFalse(validator.validateLastName("Doe1"));
        }

        @Test
        void testEmail_HappyCase() {
            assertTrue(validator.validateEmail("abc@yahoo.com"));
            assertTrue(validator.validateEmail("abc-100@yahoo.com"));
            assertTrue(validator.validateEmail("abc.100@yahoo.com"));
        }

        @Test
        void testEmail_SadCase() {
            assertFalse(validator.validateEmail("abc"));                   // missing '@'
            assertFalse(validator.validateEmail("abc@.com.my"));           // tld starts with '.'
            assertFalse(validator.validateEmail("abc123@gmail.a"));        // invalid tld
            assertFalse(validator.validateEmail("abc@abc@gmail.com"));     // multiple '@'
            assertFalse(validator.validateEmail("abc@gmail.com.1a"));      // tld with digit
        }

        @Test
        void testMobile_HappyCase() {
            assertTrue(validator.validateMobile("91 9919819801"));
            assertTrue(validator.validateMobile("1 1234567890"));
        }

        @Test
        void testMobile_SadCase() {
            assertFalse(validator.validateMobile("919919819801"));
            assertFalse(validator.validateMobile("91 991981980"));
            assertFalse(validator.validateMobile("+91 9919819801"));
        }

        @Test
        void testPassword_HappyCase() {
            assertTrue(validator.validatePassword("Password@123"));
            assertTrue(validator.validatePassword("Secure@2023"));
        }

        @Test
        void testPassword_SadCase() {
            assertFalse(validator.validatePassword("password"));
            assertFalse(validator.validatePassword("PASSWORD"));
            assertFalse(validator.validatePassword("Pass@"));
            assertFalse(validator.validatePassword("Pass1234"));
        }
    }

