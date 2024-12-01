public class UserRegistration {

    //method to validate userName
    public boolean isValidfirstName(String firstName) {
        return firstName.matches("^[A-z][a-zA-Z]{2,}$");
    }
}
