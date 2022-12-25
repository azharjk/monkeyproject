package com.github.azharjk.monkeyproject.api.aktivitaskuliah;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AktivitasKuliahConfiguration {
    @Bean
    public AktivitasKuliahService aktivitasKuliahService(AktivitasKuliahRepository aktivitasKuliahRepository) {
        return new AktivitasKuliahServiceImpl(aktivitasKuliahRepository);
    }
}
