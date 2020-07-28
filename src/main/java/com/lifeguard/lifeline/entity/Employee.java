package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;

@Data
@Entity(name = "EMPLOYEE")
public class Employee extends Base{
    @NaturalId
    String nic;
    String firstName;
    String lastName;
    String birthDay;
    String address;
    String email;
    String mobileNo;
    String gender;
    String password;
    String userRole;
}
