package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Entity(name = "MATERIAL_MASTER")
public class MaterialMaster extends Base {

    String materialName;

    @NaturalId
    String materialCode;

//    @ManyToOne(cascade = {
//            CascadeType.DETACH,
//            CascadeType.REFRESH}, fetch = FetchType.EAGER)
//    MaterialType materialType;
//cascade = {CascadeType.DETACH, CascadeType.REFRESH}
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "supplier_id", updatable = true, insertable = true)
    List<Supplier> suppliers = new ArrayList<>();

//
//    @OneToMany(cascade = CascadeType.ALL)
//    List<QualityDetails> qualityDetails = new ArrayList<>();

//    @OneToMany(cascade = CascadeType.ALL)
//    List<ProductMaster> products = new ArrayList<>();

}
