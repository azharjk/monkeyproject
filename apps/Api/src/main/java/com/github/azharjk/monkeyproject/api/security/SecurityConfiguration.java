package com.github.azharjk.monkeyproject.api.security;

import com.github.azharjk.monkeyproject.api.token.RSAKey;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {  
    private final RSAKey rsaKey;

    public SecurityConfiguration(RSAKey rsaKey) {
        this.rsaKey = rsaKey;
    }
    
    
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable()
               .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
               .and().authorizeHttpRequests().requestMatchers("/api/login").permitAll()
               .anyRequest().authenticated()
               .and().oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
               .build();
    }    
    
    @Bean
    public JwtDecoder jwtDecoder() {
        return NimbusJwtDecoder.withPublicKey(rsaKey.getPublicKey()).build();
    }
}
