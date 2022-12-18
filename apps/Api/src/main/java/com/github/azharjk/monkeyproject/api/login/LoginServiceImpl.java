package com.github.azharjk.monkeyproject.api.login;

import com.github.azharjk.monkeyproject.api.mahasiswa.Mahasiswa;
import com.github.azharjk.monkeyproject.api.mahasiswa.MahasiswaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginServiceImpl implements LoginService {
    private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    private final MahasiswaRepository mahasiswaRepository;

    public LoginServiceImpl(MahasiswaRepository mahasiswaRepository) {
        this.mahasiswaRepository = mahasiswaRepository;
    }
    
    private boolean attempt(LoginInput input) {
        Mahasiswa mahasiswa = mahasiswaRepository.findByNim(input.getNim());
        if (mahasiswa == null) {
            return false;
        }
        
        // FIXME: This pinCode should be hash first
        //        But the implementation right now
        //        is fine.
        String pinCode = mahasiswa.getPinCode();
        return pinCode.equals(input.getPinCode());
    }
    
    @Override
    public String login(LoginInput input) throws InvalidCredentialsException {
        if (!attempt(input)) {
            logger.info("Failed attempt to login with credentials nim={} pinCode={}", input.getNim(), input.getPinCode());
            throw new InvalidCredentialsException(input);
        }
        
        // FIXME: Return real token
        return "HARDCODEDTOKENHEHE";
    }
    
}
