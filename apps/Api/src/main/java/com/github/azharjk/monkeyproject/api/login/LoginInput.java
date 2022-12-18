package com.github.azharjk.monkeyproject.api.login;

import jakarta.validation.constraints.NotBlank;

public class LoginInput {
    @NotBlank
    private String nim;
    
    @NotBlank
    private String pinCode;

    public LoginInput() {
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
}
