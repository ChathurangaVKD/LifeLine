package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;


@Data
@Entity(name = "USER_TYPE")
public class UserType extends Base {
    @NaturalId
    String userTypeCode;
    String userTypename;
}
