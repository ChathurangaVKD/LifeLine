package com.lifeguard.lifeline.entity;


import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity(name = "USER_PERMISSION")
public class UserPermission extends Base {
    Boolean accounting;
    Boolean costing;
    Boolean hr;
    Boolean inventory;
    Boolean production;
    Boolean quality;
    Boolean sales;
}
