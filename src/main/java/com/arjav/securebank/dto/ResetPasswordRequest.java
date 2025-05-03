package com.arjav.securebank.dto;

public record ResetPasswordRequest(String identifier, String resetToken, String newPassword) {
}
