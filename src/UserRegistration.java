public class UserRegistration {

    //method to validate userName
    public boolean isValidPassword(String password) {

        return password.matches("^(?=.*[0-9]).{8,}$");
    }
}
