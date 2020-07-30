package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.QualityDetails;
import com.lifeguard.lifeline.service.QualityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QualityDetailController {

    private QualityService qualityService;

    public QualityDetailController(QualityService qualityService) {
        this.qualityService = qualityService;
    }

    @PostMapping(path = "/quality/create")
    public QualityDetails create(@RequestBody QualityDetails qualityDetails){
        return qualityService.create(qualityDetails);
    }

    @GetMapping(path = "/quality/get/{qualityId}")
    public QualityDetails get(@PathVariable("qualityId") Long qualityId){
        return qualityService.get(qualityId);
    }

    @GetMapping(path = "/quality/get-all")
    public List<QualityDetails> getAll(){
        return qualityService.getAll();
    }

    @DeleteMapping(path = "/quality/delete/{qualityId}")
    public void delete(@PathVariable("qualityId") Long qualityId){
        qualityService.delete(qualityId);
    }
}
