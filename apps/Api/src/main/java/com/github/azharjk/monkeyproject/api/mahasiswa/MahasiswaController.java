package com.github.azharjk.monkeyproject.api.mahasiswa;

import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MahasiswaController {
    private final MahasiswaService mahasiswaService;

    public MahasiswaController(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }
    
    @GetMapping("/mahasiswa")
    public Mahasiswa findAll(JwtAuthenticationToken authentication) {
        Jwt jwt = (Jwt) authentication.getCredentials();
        Long mahasiswaId = Long.valueOf(jwt.getSubject());
        return mahasiswaService.findById(mahasiswaId);
    }
}
