package com.lifeguard.lifeline.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity(name = "MATERIAL_TYPE")
public class MaterialType extends Base{
    String materialType;
    String materialTypeCode;
}
