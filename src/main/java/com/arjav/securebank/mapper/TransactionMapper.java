package com.arjav.securebank.mapper;

import org.springframework.stereotype.Component;

import com.arjav.securebank.dto.TransactionDTO;
import com.arjav.securebank.entity.Transaction;

@Component
public class TransactionMapper {

    public TransactionDTO toDto(Transaction transaction) {
        return new TransactionDTO(transaction);
    }

}
