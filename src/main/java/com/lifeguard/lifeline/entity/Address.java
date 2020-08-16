package com.lifeguard.lifeline.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity(name = "ADDRESS")
public class Address extends Base {
    String no;
    String lane;
    String city;
    Long postalCode;
    String country;
}
