package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "SUPPLIER")
public class Supplier extends Base {

    String supplierName;
    @NaturalId
    String registerNo;
    String mobileNo;
    String email;
    String fax;
    String currency;
    Integer creditPeriod;

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH}, fetch = FetchType.EAGER)
    UserType supplierType;

    @OneToOne(cascade = CascadeType.ALL)
    Address registerAddress;

    @OneToOne(cascade = CascadeType.ALL)
    Address communicationAddress;

//    @OneToMany(cascade = CascadeType.ALL)
//    List<String> itemAssign = new ArrayList<>();
}
