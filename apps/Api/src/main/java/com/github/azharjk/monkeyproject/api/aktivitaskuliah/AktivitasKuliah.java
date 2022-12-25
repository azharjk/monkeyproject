package com.github.azharjk.monkeyproject.api.aktivitaskuliah;

import com.github.azharjk.monkeyproject.api.mahasiswa.Mahasiswa;
import com.github.azharjk.monkeyproject.api.matakuliah.MataKuliah;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class AktivitasKuliah {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column
    private LocalDate date;
    
    @Column
    private LocalTime time;
            
    @ManyToOne  
    private MataKuliah mataKuliah;
    
    @ManyToOne
    private Mahasiswa mahasiswa;

    public AktivitasKuliah() {
    }

    public AktivitasKuliah(LocalDate date, LocalTime time, MataKuliah mataKuliah, Mahasiswa mahasiswa) {
        this.date = date;
        this.time = time;
        this.mataKuliah = mataKuliah;
        this.mahasiswa = mahasiswa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
}
