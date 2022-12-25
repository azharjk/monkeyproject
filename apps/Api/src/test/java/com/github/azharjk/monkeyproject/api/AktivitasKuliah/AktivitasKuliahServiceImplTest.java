package com.github.azharjk.monkeyproject.api.AktivitasKuliah;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AktivitasKuliahServiceImplTest {
    @Test
    public void testFindByMahasiswaId() {
        // Set up mock AktivitasKuliahRepository
        AktivitasKuliahRepository mockRepository = Mockito.mock(AktivitasKuliahRepository.class);
        Mockito.when(mockRepository.findByMahasiswaId(1L)).thenReturn(
            Arrays.asList(new AktivitasKuliah(), new AktivitasKuliah())
        );
        
        // Create AktivitasKuliahServiceImpl with mock repository
        AktivitasKuliahServiceImpl service = new AktivitasKuliahServiceImpl(mockRepository);
        
        // Call findByMahasiswaId and verify result
        List<AktivitasKuliah> result = service.findByMahasiswaId(1L);
        assertEquals(2, result.size());
    }
}
