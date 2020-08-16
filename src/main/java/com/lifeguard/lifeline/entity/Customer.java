package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "CUSTOMER")
public class Customer extends Base {

    String customerName;
    @NaturalId
    String registerNo;
    String currency;
    String mobileNo;
    String email;
    String fax;

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH}, fetch = FetchType.EAGER)
    UserType customerType;

    @OneToOne(cascade = CascadeType.ALL)
    Address registerAddress;

    @OneToOne(cascade = CascadeType.ALL)
    Address communicationAddress;

}
