public class UserRegistration {

    //method to validate userName
    public boolean isValidPassword(String password) {

        return password.matches("^(?=(?:[^!@#$%^&*()_+=-]*[!@#$%^&*()_+=-][^!@#$%^&*()_+=-]*){1}$)(?=.*[A-Z])(?=.*[0-9]).{8,}$");
    }
}
