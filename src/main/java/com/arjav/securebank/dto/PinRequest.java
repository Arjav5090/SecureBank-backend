package com.arjav.securebank.dto;

public record PinRequest(String accountNumber, String pin, String password) {
}
