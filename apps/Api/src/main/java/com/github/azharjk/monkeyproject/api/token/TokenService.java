package com.github.azharjk.monkeyproject.api.token;

import com.github.azharjk.monkeyproject.api.mahasiswa.Mahasiswa;

public interface TokenService {
    TokenPair generate(Mahasiswa mahasiswa);
}
