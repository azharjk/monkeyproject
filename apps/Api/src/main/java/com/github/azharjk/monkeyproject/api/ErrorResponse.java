package com.github.azharjk.monkeyproject.api;

public class ErrorResponse {
    private ErrorType error;
    private String reason;

    public ErrorResponse() {
    }

    public ErrorResponse(ErrorType error, String reason) {
        this.error = error;
        this.reason = reason;
    }
    
    public ErrorType getError() {
        return error;
    }

    public void setError(ErrorType error) {
        this.error = error;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
