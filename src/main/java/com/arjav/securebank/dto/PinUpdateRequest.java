package com.arjav.securebank.dto;

public record PinUpdateRequest(String accountNumber, String oldPin, String newPin, String password) {
}
