package com.github.azharjk.monkeyproject.api.AktivitasKuliah;

import java.util.List;

public class AktivitasKuliahServiceImpl implements AktivitasKuliahService {

    private final AktivitasKuliahRepository aktivitasKuliahRepository;

    public AktivitasKuliahServiceImpl(AktivitasKuliahRepository aktivitasKuliahRepository) {
        this.aktivitasKuliahRepository = aktivitasKuliahRepository;
    }
    
    @Override
    public List<AktivitasKuliah> findByMahasiswaId(Long mahasiswaId) {
        return aktivitasKuliahRepository.findByMahasiswaId(mahasiswaId);
    }
    
}
