package com.github.azharjk.monkeyproject.api.AktivitasKuliah;

import com.github.azharjk.monkeyproject.api.aktivitaskuliah.AktivitasKuliahController;
import com.github.azharjk.monkeyproject.api.aktivitaskuliah.AktivitasKuliah;
import com.github.azharjk.monkeyproject.api.aktivitaskuliah.AktivitasKuliahService;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

public class AktivitasKuliahControllerTest {
    @Test
    public void testFindAll() {
        // Set up mock JwtAuthenticationToken
        Jwt jwt = Mockito.mock(Jwt.class);
        Mockito.when(jwt.getSubject()).thenReturn("1");
        JwtAuthenticationToken authentication = Mockito.mock(JwtAuthenticationToken.class);
        Mockito.when(authentication.getCredentials()).thenReturn(jwt);
        
        // Set up mock AktivitasKuliahService
        AktivitasKuliahService mockService = Mockito.mock(AktivitasKuliahService.class);
        Mockito.when(mockService.findByMahasiswaId(1L)).thenReturn(
            Arrays.asList(new AktivitasKuliah(), new AktivitasKuliah())
        );
        
        // Create AktivitasKuliahController with mock service
        AktivitasKuliahController controller = new AktivitasKuliahController(mockService);
        
        // Call findAll and verify result
        List<AktivitasKuliah> result = controller.findAll(authentication);
        assertEquals(2, result.size());
    }   
}
