//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no3;

public class InvalidDataException extends Exception{
    public InvalidDataException() {
        super("Invalid Data");
    }
    public InvalidDataException(String message) {
        super(message);
    }
}
