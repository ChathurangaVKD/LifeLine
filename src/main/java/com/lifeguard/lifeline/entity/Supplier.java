package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "SUPPLIER")
public class Supplier extends Base{
    String supplierName;
    @NaturalId
    String registerNo;
    String registerAddress;
    String communicationAddress;
//    List<String> mobileNo = new ArrayList<>();
//    List<String> email = new ArrayList<>();
//    List<String> fax = new ArrayList<>();
    String supplierType;
    String currency;
    Integer creditPeriod;
//    @OneToMany(cascade = CascadeType.ALL)
//    List<String> itemAssign = new ArrayList<>();
}
