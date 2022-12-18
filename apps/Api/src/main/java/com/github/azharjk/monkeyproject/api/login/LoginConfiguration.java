package com.github.azharjk.monkeyproject.api.login;

import com.github.azharjk.monkeyproject.api.mahasiswa.MahasiswaRepository;
import com.github.azharjk.monkeyproject.api.token.TokenService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoginConfiguration {
    private final MahasiswaRepository mahasiswaRepository;
    private final TokenService tokenService;

    public LoginConfiguration(MahasiswaRepository mahasiswaRepository, TokenService tokenService) {
        this.mahasiswaRepository = mahasiswaRepository;
        this.tokenService = tokenService;
    }
    
    @Bean
    public LoginService loginService() {
        return new LoginServiceImpl(mahasiswaRepository, tokenService);
    }
}
