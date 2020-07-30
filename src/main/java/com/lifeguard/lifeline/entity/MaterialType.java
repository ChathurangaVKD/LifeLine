package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;

@Data
@Entity(name = "MATERIAL_TYPE")
public class MaterialType extends Base{

    String materialType;
    @NaturalId
    String materialTypeCode;
}
