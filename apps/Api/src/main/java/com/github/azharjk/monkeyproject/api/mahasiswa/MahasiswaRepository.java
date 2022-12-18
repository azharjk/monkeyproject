package com.github.azharjk.monkeyproject.api.mahasiswa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long> {
    Mahasiswa findByNim(String nim);
}
