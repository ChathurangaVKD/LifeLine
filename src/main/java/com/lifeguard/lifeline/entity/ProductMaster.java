package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;

@Data
@Entity(name = "PRODUCT_MASTER")
public class ProductMaster extends Base{
    String productName;
    @NaturalId
    String productCode;
    String ProductType;
}
