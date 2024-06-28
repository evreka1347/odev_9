package org.example;

public class DivisionByZeroException extends Exception {

    public DivisionByZeroException()  {
        super("Sıfıra bölünemez.");
    }

    public DivisionByZeroException(String message) {
        super(message);
    }
}
