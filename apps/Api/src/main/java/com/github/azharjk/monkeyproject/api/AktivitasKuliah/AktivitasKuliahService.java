package com.github.azharjk.monkeyproject.api.AktivitasKuliah;

import java.util.List;

public interface AktivitasKuliahService {
    List<AktivitasKuliah> findByMahasiswaId(Long mahasiswaId);
}
