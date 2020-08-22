package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.UserType;
import com.lifeguard.lifeline.service.UserTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserTypeController {

    private UserTypeService userTypeService;

    public UserTypeController(UserTypeService userTypeService) {
        this.userTypeService = userTypeService;
    }

    @PostMapping(path = "/user/create-user-type")
    public UserType createUserType(@RequestBody UserType userType) {
        return userTypeService.createUserType(userType);
    }

    @GetMapping(path = "/user/get-all-user-type")
    public List<UserType> getAllUserType() {
        return userTypeService.getAllUserType();
    }

    @GetMapping(path = "/user/get-user-type-by-id/{userTypeId}")
    public UserType getUserTypeById(@PathVariable("userTypeId") Long userTypeId) {
        return userTypeService.getUserTypeById(userTypeId);
    }

    @DeleteMapping(path = "/user/delete-user-type/{userTypeId}")
    public void deleteUserType(@PathVariable("userTypeId") Long userTypeId) {
        userTypeService.deleteUserType(userTypeId);
    }
}
