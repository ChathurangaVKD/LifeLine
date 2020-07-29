package com.lifeguard.lifeline.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity(name = "QUALITY_DETAILS")
public class QualityDetails extends Base{
    String qualityParameterName;
    String qualityParameterCode;
}
