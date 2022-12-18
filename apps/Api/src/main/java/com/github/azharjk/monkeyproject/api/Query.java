package com.github.azharjk.monkeyproject.api;

import com.github.azharjk.monkeyproject.api.login.LoginInput;
import com.github.azharjk.monkeyproject.api.login.LoginResponse;
import com.github.azharjk.monkeyproject.api.login.LoginService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Query {
    private static final Logger logger = LoggerFactory.getLogger(Query.class);
    
    private final LoginService loginService;

    public Query(LoginService loginService) {
        this.loginService = loginService;
    }
    
    @QueryMapping
    public String ping() {
        return "pong";
    }
    
    @QueryMapping
    public LoginResponse login(@Valid @Argument LoginInput input) {        
        logger.info("Attempt login with credentials nim={} pinCode={}", input.getNim(), input.getPinCode());   
        return loginService.login(input);
    }
}
