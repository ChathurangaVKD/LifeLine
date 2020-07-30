package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "CUSTOMER")
public class Customer extends Base{

    String customerName;
    @NaturalId
    String registerNo;
    String currency;
    String customerType;

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

}
