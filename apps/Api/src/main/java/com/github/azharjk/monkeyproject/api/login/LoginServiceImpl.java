package com.github.azharjk.monkeyproject.api.login;

import com.github.azharjk.monkeyproject.api.mahasiswa.Mahasiswa;
import com.github.azharjk.monkeyproject.api.mahasiswa.MahasiswaRepository;
import com.github.azharjk.monkeyproject.api.token.CannotInitializeTokenException;
import com.github.azharjk.monkeyproject.api.token.TokenPair;
import com.github.azharjk.monkeyproject.api.token.TokenService;

public class LoginServiceImpl implements LoginService {
    private final MahasiswaRepository mahasiswaRepository;
    private final TokenService tokenService;

    public LoginServiceImpl(MahasiswaRepository mahasiswaRepository, TokenService tokenService) {
        this.mahasiswaRepository = mahasiswaRepository;
        this.tokenService = tokenService;
    }
    
    @Override
    public LoginResponse login(LoginInput input) throws InvalidCredentialsException, CannotInitializeTokenException {
        Mahasiswa mahasiswa = mahasiswaRepository.findByNim(input.getNim());
        if (mahasiswa == null) {
            throw new InvalidCredentialsException(input);
        }
        
        // FIXME: This pinCode should be hash first
        //        But the implementation right now
        //        is fine.
        String pinCode = mahasiswa.getPinCode();
        if (!pinCode.equals(input.getPinCode())) {
            throw new InvalidCredentialsException(input);
        }
        
        TokenPair pair = tokenService.generate(mahasiswa);
        if (pair == null) {
            throw new CannotInitializeTokenException();
        }
        
        return new LoginResponse(pair.getAccessToken(), pair.getRefreshToken());
    }
    
}
