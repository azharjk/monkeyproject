package com.github.azharjk.monkeyproject.api.security;

import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtException;

public class DevJwtDecoder implements JwtDecoder {

    @Override
    public Jwt decode(String token) throws JwtException {
        return Jwt.withTokenValue("dev")
                .subject("1")
                .header("foo", "bar")
                .build();
    }
    
}
