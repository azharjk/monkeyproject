package com.github.azharjk.monkeyproject.api;

import com.github.azharjk.monkeyproject.api.AktivitasKuliah.AktivitasKuliah;
import com.github.azharjk.monkeyproject.api.AktivitasKuliah.AktivitasKuliahRepository;
import com.github.azharjk.monkeyproject.api.mahasiswa.Mahasiswa;
import com.github.azharjk.monkeyproject.api.mahasiswa.MahasiswaRepository;
import com.github.azharjk.monkeyproject.api.matakuliah.MataKuliah;
import com.github.azharjk.monkeyproject.api.matakuliah.MataKuliahRepository;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class OnStartup implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(OnStartup.class);
    
    private final String MAKE_DEFAULT_USER = "make.default_user";
    private final String SEED_MATA_KULIAH = "seed.mata_kuliah";
    private final String SEED_AKTIVITAS_KULIAH = "seed.aktivitas_kuliah";
    
    private final MataKuliahRepository mataKuliahRepository;
    private final MahasiswaRepository mahasiswaRepository;
    private final AktivitasKuliahRepository aktivitasKuliahRepository;

    public OnStartup(MataKuliahRepository mataKuliahRepository, MahasiswaRepository mahasiswaRepository, AktivitasKuliahRepository aktivitasKuliahRepository) {
        this.mataKuliahRepository = mataKuliahRepository;
        this.mahasiswaRepository = mahasiswaRepository;
        this.aktivitasKuliahRepository = aktivitasKuliahRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Set<String> optionNames = args.getOptionNames();
        
        if (optionNames.contains(MAKE_DEFAULT_USER)) {
            logger.info("Make default user");
            mahasiswaRepository.save(new Mahasiswa("Muhammad Azhari", "152022170", "123456"));
        }
        
        if (optionNames.contains(SEED_MATA_KULIAH)) {
            logger.info("Seed mata kuliah");
            mataKuliahRepository.save(new MataKuliah("Matematika", 3));
            mataKuliahRepository.save(new MataKuliah("Matematika Komputer", 3));
            mataKuliahRepository.save(new MataKuliah("Algoritma Dasar", 3));
        }
        
        if (optionNames.contains(SEED_AKTIVITAS_KULIAH)) {
            if (optionNames.contains(MAKE_DEFAULT_USER) && optionNames.contains(SEED_MATA_KULIAH)) {
                logger.info("Seed aktivitas kuliah");
                
                Mahasiswa mahasiswa = mahasiswaRepository.findById(1L).orElseThrow();
                MataKuliah mataKuliah = mataKuliahRepository.findById(1L).orElseThrow();
                aktivitasKuliahRepository.save(new AktivitasKuliah(LocalDate.now(), LocalTime.now(), mataKuliah, mahasiswa));
                
                mataKuliah = mataKuliahRepository.findById(2L).orElseThrow();
                aktivitasKuliahRepository.save(new AktivitasKuliah(LocalDate.now().plusDays(2), LocalTime.now(), mataKuliah, mahasiswa));

            }
        }
    }
    
}
