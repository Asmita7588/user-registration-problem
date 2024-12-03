package org.example;

    public class UserValidator {


        private static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
        private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$";;
        private static final String MOBILE_REGEX = "^[0-9]{1,3} [0-9]{10}$";
        private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";


        public boolean validateFirstName(String firstName) {
            return firstName.matches(NAME_REGEX);
        }

        public boolean validateLastName(String lastName) {
            return lastName.matches(NAME_REGEX);
        }

        public boolean validateEmail(String email) {
            return email.matches(EMAIL_REGEX);
        }

        public boolean validateMobile(String mobile) {
            return mobile.matches(MOBILE_REGEX);
        }

        public boolean validatePassword(String password) {
            return password.matches(PASSWORD_REGEX);
        }

    }


