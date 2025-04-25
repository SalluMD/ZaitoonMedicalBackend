package medical.zaitoon.pharmacy.exceptions;

public class MissingDetailsException extends Exception{

    private final String message;
    public MissingDetailsException(String message) {
        this.message = message;
    }

}
