package br.com.fparuce.challengebackend.shared;

import lombok.Data;

@Data
public class ErrorResponse {
    private String message;
    private int status;
    private String timestamp;

    public ErrorResponse(String message, int status) {
        this.message = message;
        this.status = status;
        this.timestamp = java.time.LocalDateTime.now().toString();
    }
}
