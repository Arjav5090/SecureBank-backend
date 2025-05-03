package com.arjav.securebank.exception;

public class InvalidOtpException extends RuntimeException {

    public InvalidOtpException(String msg) {
        super(msg);
    }
}
