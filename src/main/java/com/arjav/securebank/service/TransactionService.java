package com.arjav.securebank.service;

import java.util.List;

import com.arjav.securebank.dto.TransactionDTO;

public interface TransactionService {

	List<TransactionDTO> getAllTransactionsByAccountNumber(String accountNumber);

}
