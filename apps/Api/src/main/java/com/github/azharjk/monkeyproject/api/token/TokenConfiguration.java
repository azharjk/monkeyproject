package com.github.azharjk.monkeyproject.api.token;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TokenConfiguration {
    @Bean
    public TokenService tokenService() throws Exception {
        return new JwtTokenServiceImpl(rsaKey());
    }
    
    @Bean
    public RSAKey rsaKey() throws Exception {
        return RSAKey.create();
    }
}
