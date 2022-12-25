package com.github.azharjk.monkeyproject.api.aktivitaskuliah;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AktivitasKuliahRepository extends JpaRepository<AktivitasKuliah, Long> {
    List<AktivitasKuliah> findByMahasiswaId(Long mahasiswaId);
}
