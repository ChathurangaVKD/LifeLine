package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.Email;

public interface EmailService {
    Email create(Email email);
    void delete(Long emailId);
}
