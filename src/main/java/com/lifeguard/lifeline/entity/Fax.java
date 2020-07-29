package com.lifeguard.lifeline.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity(name = "FAX")
public class Fax extends Base{
    String fax;
}
