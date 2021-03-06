package com.coding.challenge.api;

public class ApiError extends RuntimeException {

    private String errorCode;

    public ApiError(String message, String errorCode){
        super(message);
        this.errorCode = errorCode;
    }

    String getErrorCode() {
        return errorCode;
    }
}
