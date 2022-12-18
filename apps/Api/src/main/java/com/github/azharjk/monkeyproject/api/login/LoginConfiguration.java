package com.github.azharjk.monkeyproject.api.login;

import com.github.azharjk.monkeyproject.api.mahasiswa.MahasiswaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoginConfiguration {
    private final MahasiswaRepository mahasiswaRepository;

    public LoginConfiguration(MahasiswaRepository mahasiswaRepository) {
        this.mahasiswaRepository = mahasiswaRepository;
    }
    
    @Bean
    public LoginService loginService() {
        return new LoginServiceImpl(mahasiswaRepository);
    }
}
