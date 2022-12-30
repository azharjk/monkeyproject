package com.github.azharjk.monkeyproject.api.mahasiswa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MahasiswaConfiguration {
    @Bean
    public MahasiswaService mahasiswaService(MahasiswaRepository mahasiswaRepository) {
        return new MahasiswaServiceImpl(mahasiswaRepository);
    }
}
