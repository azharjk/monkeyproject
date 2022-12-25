package com.github.azharjk.monkeyproject.api.AktivitasKuliah;

import java.util.List;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AktivitasKuliahController {
    private final AktivitasKuliahService aktivitasKuliahService;

    public AktivitasKuliahController(AktivitasKuliahService aktivitasKuliahService) {
        this.aktivitasKuliahService = aktivitasKuliahService;
    }
    
    @GetMapping("/aktivitas-kuliah")
    public List<AktivitasKuliah> findAll(JwtAuthenticationToken authentication) {
        Jwt jwt = (Jwt) authentication.getCredentials();
        Long mahasiswaId = Long.valueOf(jwt.getSubject());
        return aktivitasKuliahService.findByMahasiswaId(mahasiswaId);
    }
}
