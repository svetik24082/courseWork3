package com.example.coursework3.exception;

public class InvalidSockRequestException extends RuntimeException {
    public InvalidSockRequestException(String massage) {
        super(massage);
    }
}
