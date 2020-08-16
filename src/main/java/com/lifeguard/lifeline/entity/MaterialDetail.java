package com.lifeguard.lifeline.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Data
@Entity(name = "MATERIAL_DETAIL")
public class MaterialDetail extends Base {

    @OneToOne(cascade = CascadeType.ALL)
    MaterialMaster material;

    @OneToOne(cascade = CascadeType.ALL)
    Supplier supplier;

    Long quantity;
    Double purchasingPrice;
    Date ExpireDate;

}
