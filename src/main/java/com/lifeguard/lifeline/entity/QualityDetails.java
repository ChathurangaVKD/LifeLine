package com.lifeguard.lifeline.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;

@Data
@Entity(name = "QUALITY_DETAILS")
public class QualityDetails extends Base{

    String qualityParameterName;
    @NaturalId
    String qualityParameterCode;
}
