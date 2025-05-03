package com.arjav.securebank.service;

import org.springframework.http.ResponseEntity;

import com.arjav.securebank.dto.OtpRequest;
import com.arjav.securebank.dto.OtpVerificationRequest;
import com.arjav.securebank.dto.ResetPasswordRequest;
import com.arjav.securebank.entity.User;

public interface AuthService {
    public String generatePasswordResetToken(User user);

    public boolean verifyPasswordResetToken(String token, User user);

    public void deletePasswordResetToken(String token);

    public ResponseEntity<String> sendOtpForPasswordReset(OtpRequest otpRequest);

    public ResponseEntity<String> verifyOtpAndIssueResetToken(OtpVerificationRequest otpVerificationRequest);

    public ResponseEntity<String> resetPassword(ResetPasswordRequest resetPasswordRequest);

}
