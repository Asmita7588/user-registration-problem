package org.example;


public class InvalidFirstNameExceptions  extends RuntimeException{
    public InvalidFirstNameExceptions(String msg){
        super(msg);
    }

}
class InvalidLastNameExceptions  extends RuntimeException{
    public  InvalidLastNameExceptions(String msg){
        super(msg);
    }
}

class InvalidEmailExceptions  extends RuntimeException{
    public InvalidEmailExceptions(String msg){
        super(msg);
    }
}

class InvalidMobileNumberExceptions  extends RuntimeException{
    public InvalidMobileNumberExceptions(String msg){
        super(msg);
    }
}

class InvalidPasswordExceptions  extends RuntimeException{
    public InvalidPasswordExceptions(String msg){
        super(msg);
    }
}
