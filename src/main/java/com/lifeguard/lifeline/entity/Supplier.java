package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "SUPPLIER")
public class Supplier extends Base{

    String supplierName;
    @NaturalId
    String registerNo;
    String supplierType;
    String currency;
    Integer creditPeriod;

    @OneToOne(cascade = CascadeType.ALL)
    Address registerAddress;

    @OneToOne(cascade = CascadeType.ALL)
    Address communicationAddress;

    @OneToMany(cascade = CascadeType.ALL)
    List<MobileNo> mobileNo = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    List<Email> email = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    List<Fax> fax = new ArrayList<>();

//    @OneToMany(cascade = CascadeType.ALL)
//    List<String> itemAssign = new ArrayList<>();
}
