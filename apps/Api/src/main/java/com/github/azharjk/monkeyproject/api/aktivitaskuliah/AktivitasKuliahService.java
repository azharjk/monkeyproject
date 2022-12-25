package com.github.azharjk.monkeyproject.api.aktivitaskuliah;

import java.util.List;

public interface AktivitasKuliahService {
    List<AktivitasKuliah> findByMahasiswaId(Long mahasiswaId);
}
