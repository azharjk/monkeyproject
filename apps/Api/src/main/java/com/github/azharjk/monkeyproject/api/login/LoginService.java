package com.github.azharjk.monkeyproject.api.login;

import com.github.azharjk.monkeyproject.api.token.CannotInitializeTokenException;

public interface LoginService {
    LoginResponse login(LoginInput input) throws InvalidCredentialsException, CannotInitializeTokenException;
}
