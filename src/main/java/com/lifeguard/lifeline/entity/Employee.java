package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Data
@Entity(name = "EMPLOYEE")
public class Employee extends Base{

    @NaturalId
    String nic;
    @NaturalId
    String userName;
    String firstName;
    String lastName;
    String birthDay;
    String gender;
    String password;
    String email;
    String mobileNo;
    
    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH}, fetch = FetchType.EAGER)
    UserType userType;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;

}
