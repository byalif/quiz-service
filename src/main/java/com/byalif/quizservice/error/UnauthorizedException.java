package com.byalif.quizservice.error;
import org.springframework.http.HttpStatus;

public class UnauthorizedException extends RuntimeException {

    private final HttpStatus status;

    public UnauthorizedException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}