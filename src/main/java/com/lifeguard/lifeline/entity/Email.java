package com.lifeguard.lifeline.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity(name = "EMAIL")
public class Email extends Base {
    String email;
}
