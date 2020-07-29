package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "MATERIAL_MASTER")
public class MaterialMaster extends Base{

    String materialName;
    @NaturalId
    String materialCode;

    @OneToOne(cascade = CascadeType.ALL)
    MaterialType materialType;

    @OneToMany(cascade = CascadeType.ALL)
    List<Supplier> suppliers = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    List<QualityDetails> qualityDetails = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    List<ProductMaster> products = new ArrayList<>();

}
