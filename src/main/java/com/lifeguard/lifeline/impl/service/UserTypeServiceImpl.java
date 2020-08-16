package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.UserType;
import com.lifeguard.lifeline.repo.UserTypeRepo;
import com.lifeguard.lifeline.service.UserTypeService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    private UserTypeRepo userTypeRepo;

    public UserTypeServiceImpl(UserTypeRepo userTypeRepo) {
        this.userTypeRepo = userTypeRepo;
    }

    @Override
    public UserType createUserType(UserType userType) {
        return userTypeRepo.save(userType);
    }

    @Override
    public List<UserType> getAllUserType() {
        return userTypeRepo.findAll();
    }

    @Override
    public void deleteUserType(Long id) {
        userTypeRepo.deleteById(id);
    }

    @Override
    public UserType getUserTypeById(Long userTypeId) {
        return userTypeRepo.findById(userTypeId).orElseThrow(() -> new EntityNotFoundException(userTypeId + " userType Not Found"));
    }
}
