package com.lifeguard.lifeline.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity(name = "MOBILE_NO")
public class MobileNo extends Base {
    String mobileNo;
}
