package com.github.azharjk.monkeyproject.api.mahasiswa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column
    private String name;
    
    @Column
    private String nim;
    
    @Column
    private String pinCode;

    public Mahasiswa() {
    }

    public Mahasiswa(String name, String nim, String pinCode) {
        this.name = name;
        this.nim = nim;
        this.pinCode = pinCode;
    } 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", name=" + name + ", nim=" + nim + ", pinCode=" + pinCode + '}';
    }
}
