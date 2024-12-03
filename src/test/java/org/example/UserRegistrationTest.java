package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
        assertTrue(validator.validateEmail(email), "Email should be valid: " + email);
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
        assertFalse(validator.validateEmail(email), "Email should be invalid: " + email);
    }
    }

