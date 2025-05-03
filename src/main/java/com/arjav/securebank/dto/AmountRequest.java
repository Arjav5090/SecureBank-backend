package com.arjav.securebank.dto;

public record AmountRequest(String accountNumber, String pin, double amount) {
}
