package com.arjav.securebank.service;

import com.arjav.securebank.dto.AccountResponse;
import com.arjav.securebank.dto.UserResponse;

public interface DashboardService {
    UserResponse getUserDetails(String accountNumber);
    AccountResponse getAccountDetails(String accountNumber);
}