package com.github.azharjk.monkeyproject.api.login;

import com.github.azharjk.monkeyproject.api.ErrorResponse;
import com.github.azharjk.monkeyproject.api.ErrorType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    
    @ExceptionHandler(InvalidCredentialsException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ErrorResponse invalidCredentialsExceptionHandler(InvalidCredentialsException ex) {
        return new ErrorResponse(ErrorType.INVALID_CREDENTIALS, ex.getMessage());
    }
    
    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginInput input) {
        return loginService.login(input);
    }
}   
