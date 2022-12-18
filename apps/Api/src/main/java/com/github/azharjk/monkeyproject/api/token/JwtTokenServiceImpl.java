package com.github.azharjk.monkeyproject.api.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.github.azharjk.monkeyproject.api.mahasiswa.Mahasiswa;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JwtTokenServiceImpl implements TokenService {
    
    private static final Logger logger = LoggerFactory.getLogger(JwtTokenServiceImpl.class);

    @Override
    public TokenPair generate(Mahasiswa mahasiswa) {
        try {
            RSAKey rsaKey = RSAKey.create();
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
        } catch (NoSuchAlgorithmException ex) {
            logger.error("Exception occured when creating JWT token, details: ", ex);
        }
        return null;
    }
}
