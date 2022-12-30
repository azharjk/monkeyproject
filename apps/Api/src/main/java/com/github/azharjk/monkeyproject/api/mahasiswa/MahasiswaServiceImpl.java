package com.github.azharjk.monkeyproject.api.mahasiswa;

import java.util.Optional;

public class MahasiswaServiceImpl implements MahasiswaService {

    private final MahasiswaRepository mahasiswaRepository;

    public MahasiswaServiceImpl(MahasiswaRepository mahasiswaRepository) {
        this.mahasiswaRepository = mahasiswaRepository;
    }
    
    
    @Override
    public Mahasiswa findById(Long id) {
        Optional<Mahasiswa> mahasiswa = mahasiswaRepository.findById(id);
        return mahasiswa.orElse(null);
    }
    
}
