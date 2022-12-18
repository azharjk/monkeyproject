package com.github.azharjk.monkeyproject.api.token;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class RSAKey {
    private final RSAPrivateKey privateKey;
    private final RSAPublicKey publicKey;
    
    public static RSAKey create() throws NoSuchAlgorithmException {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        KeyPair pair = generator.generateKeyPair();
        
        return new RSAKey((RSAPrivateKey) pair.getPrivate(), (RSAPublicKey) pair.getPublic());
    }

    private RSAKey(RSAPrivateKey privateKey, RSAPublicKey publicKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    } 

    public RSAPrivateKey getPrivateKey() {
        return privateKey;
    }
    
    public RSAPublicKey getPublicKey() {
        return publicKey;
    }
}
