package com.github.azharjk.monkeyproject.api.token;

public class CannotInitializeTokenException extends RuntimeException {

    public CannotInitializeTokenException() {
        super("Cannot initialize token, this is unexpected exception");
    }
    
}
