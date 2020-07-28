package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.UserType;

import java.util.List;

public interface UserTypeService {

    UserType createUserType(UserType userType);
    List<UserType> getAllUserType();
    void deleteUserType(Long id);
    UserType getUserTypeById(Long userTypeId);
}
