public class InvalidDataException extends Exception{
    public InvalidDataException() {
        super("Invalid Data");
    }
    public InvalidDataException(String message) {
        super(message);
    }
}
