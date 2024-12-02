public class UserRegistration {

    //method to validate userName
    public boolean isValidEmail(String email) {

        return email.matches("^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)?@[a-zA-Z0-9]+[.][a-zA-Z]{2,}([.][a-zA-Z]{2,})?$");
    }
}
