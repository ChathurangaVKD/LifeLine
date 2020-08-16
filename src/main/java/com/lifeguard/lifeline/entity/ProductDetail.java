package com.lifeguard.lifeline.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Data
@Entity(name = "PRODUCT_DETAIL")
public class ProductDetail extends Base {

    @OneToOne(cascade = CascadeType.ALL)
    ProductMaster product;

    Long quantity;
    Date expireDate;
    Date manufactureDate;
    String batchNo;
}
