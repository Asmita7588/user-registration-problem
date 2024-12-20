package org.example;

    public class UserValidator {


        private static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
        private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$";;
        private static final String MOBILE_REGEX = "^[0-9]{1,3} [0-9]{10}$";
        private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";



        public void validateFirstName(String firstName) {
            if(!firstName.matches(NAME_REGEX)){
               throw new InvalidFirstNameExceptions("Enter valid first Name start with capital letter and have at least 3 character");
            }
        }

        public void validateLastName(String lastName) {
            if(!lastName.matches(NAME_REGEX)){
                throw new InvalidLastNameExceptions("Enter valid last name start with capital letter and should have minimum 3 letters");
            }
        }

        public void validateEmail(String email) {
            if(!email.matches(EMAIL_REGEX)){
                throw  new InvalidEmailExceptions("Invalid Email: Does not match the required pattern.");
            }
        }

        public void validateMobile(String mobile) {
            if(!mobile.matches(MOBILE_REGEX)){
                throw new InvalidMobileNumberExceptions("Invalid Mobile number: Does not with required pattern");
            }
        }

        public void validatePassword(String password) {
            if(!password.matches(PASSWORD_REGEX)){
                throw new InvalidPasswordExceptions("Invalid Password ,Does not with required pattern ");
            }
        }


        Validator<String> validateFirstName = firstName -> firstName.matches(NAME_REGEX);
        Validator<String> validateLastName = LastName -> LastName.matches(NAME_REGEX);
        Validator<String> validateEmail = email -> email.matches(EMAIL_REGEX);
        Validator<String> validatePassword = password-> password.matches(PASSWORD_REGEX);
        Validator<String> validateMobileNumber = mobileNumber -> mobileNumber.matches(MOBILE_REGEX);

        public void validateUserDetails(String firstName, String lastName, String email, String mobile, String password) {
            if (!validateFirstName.validate(firstName)) {
                throw new InvalidFirstNameExceptions("Invalid First Name");
            }
            if (!validateLastName.validate(lastName)) {
                throw new InvalidLastNameExceptions("Invalid Last Name");
            }
            if (!validateEmail.validate(email)) {
                throw new InvalidEmailExceptions("Invalid Email");
            }
            if (!validateMobileNumber.validate(mobile)) {
                throw new InvalidMobileNumberExceptions("Invalid Mobile");
            }
            if (!validatePassword.validate(password)) {
                throw new InvalidPasswordExceptions("Invalid Password");
            }

            System.out.println("All user details are valid.");
        }
    }




