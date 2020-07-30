package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.Email;
import com.lifeguard.lifeline.repo.EmailRepo;
import com.lifeguard.lifeline.service.EmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    private EmailRepo emailRepo;

    public EmailServiceImpl(EmailRepo emailRepo) {
        this.emailRepo = emailRepo;
    }

    @Override
    public Email create(Email email) {
        return emailRepo.save(email);
    }

    @Override
    public void delete(Long emailId) {
        emailRepo.deleteById(emailId);
    }
}
