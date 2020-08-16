package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "USER_TYPE")
public class UserType extends Base {
    @NaturalId
    String userTypeCode;
    String userTypename;
    Boolean accounting;
    Boolean costing;
    Boolean hr;
    Boolean inventory;
    Boolean production;
    Boolean quality;
    Boolean sales;
}
