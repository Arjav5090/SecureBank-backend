package com.arjav.securebank.dto;

public record OtpVerificationRequest(String identifier, String otp) {
}
