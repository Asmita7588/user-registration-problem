public class UserRegistration {

    //method to validate userName
    public boolean isValidLastName(String lastName) {
        return lastName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
}
