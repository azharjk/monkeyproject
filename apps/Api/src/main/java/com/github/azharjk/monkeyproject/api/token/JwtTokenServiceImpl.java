package com.github.azharjk.monkeyproject.api.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.github.azharjk.monkeyproject.api.mahasiswa.Mahasiswa;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class JwtTokenServiceImpl implements TokenService {
        
    private final RSAKey rsaKey;

    public JwtTokenServiceImpl(RSAKey rsaKey) {
        this.rsaKey = rsaKey;
    }

    @Override
    public TokenPair generate(Mahasiswa mahasiswa) {
            Algorithm algorithm = Algorithm.RSA256(rsaKey.getPublicKey(), rsaKey.getPrivateKey());
            
            String accessToken = JWT.create()
                    .withSubject(mahasiswa.getId().toString())
                    .withIssuedAt(Instant.now())
                    .withExpiresAt(Instant.now().plus(5, ChronoUnit.MINUTES))
                    .sign(algorithm);
            
            String refreshToken = JWT.create()
                    .withSubject(mahasiswa.getId().toString())
                    .withIssuedAt(Instant.now())
                    .withExpiresAt(Instant.now().plus(7, ChronoUnit.DAYS))
                    .sign(algorithm);
            
            return new TokenPair(accessToken, refreshToken);
        
    }
}
