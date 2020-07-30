package com.lifeguard.lifeline.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@Entity(name = "SALE_MASTER")
public class SaleMaster extends Base{

    @OneToOne(cascade = CascadeType.ALL)
    Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    ProductDetail productDetail;

    Long quantity;
    Long sellingPrice;
}
