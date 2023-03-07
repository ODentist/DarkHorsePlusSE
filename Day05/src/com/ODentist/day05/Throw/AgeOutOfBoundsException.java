package com.ODentist.day05.Throw;

public class AgeOutOfBoundsException extends RuntimeException{
    public AgeOutOfBoundsException() {
        super();
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
