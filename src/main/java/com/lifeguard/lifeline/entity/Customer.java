package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "CUSTOMER")
public class Customer extends Base{
    String customerName;
    @NaturalId
    String registerNo;
    String registerdAddress;
    String communicationAddress;
//    List<String> mobileNo = new ArrayList<>();;
//    List<String> email = new ArrayList<>();;
//    List<String> fax = new ArrayList<>();;
    String customerType;
    String currency;
}
