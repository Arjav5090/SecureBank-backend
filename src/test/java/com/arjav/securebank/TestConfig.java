package com.arjav.securebank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.arjav.securebank.service.EmailService;
import com.arjav.securebank.service.EmailServiceImpl;

@Configuration
public class TestConfig {

    @Bean
    @Primary
    public EmailService emailService() {
        return new EmailServiceImpl(new GreenMailJavaMailSender());
    }
}
