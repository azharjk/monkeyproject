package com.github.azharjk.monkeyproject.api.matakuliah;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MataKuliahRepository extends JpaRepository<MataKuliah, Long> {
    
}
