package com.github.azharjk.monkeyproject.api.login;

public interface LoginService {
    String login(LoginInput input) throws InvalidCredentialsException;
}
