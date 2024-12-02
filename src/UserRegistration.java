public class UserRegistration {

    //method to validate userName
    public boolean isValidMobileNumber(String mobileNumber) {

        return mobileNumber.matches("^[0-9]{1,3} [0-9]{10}$");
    }
}
