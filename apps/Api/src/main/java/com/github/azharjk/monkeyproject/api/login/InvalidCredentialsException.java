package com.github.azharjk.monkeyproject.api.login;

public class InvalidCredentialsException extends RuntimeException {

    public InvalidCredentialsException(LoginInput input) {
        super("Invalid credentials when attempting mahasiswa with nim=%s".formatted(input.getNim()));
    }
    
}
