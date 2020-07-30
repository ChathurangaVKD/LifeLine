package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.MaterialMaster;
import com.lifeguard.lifeline.service.MaterialMasterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MaterialMasterController {

    private MaterialMasterService materialMasterService;

    public MaterialMasterController(MaterialMasterService materialMasterService) {
        this.materialMasterService = materialMasterService;
    }

    @PostMapping(path = "material/create")
    public MaterialMaster create(@RequestBody MaterialMaster material){
        return materialMasterService.create(material);
    }

    @GetMapping(path = "material/get/{materialId}")
    public MaterialMaster get(@PathVariable("materialId") Long materialId){
        return materialMasterService.get(materialId);
    }

    @GetMapping(path = "material/get-all")
    public List<MaterialMaster> getAll(){
        return materialMasterService.getAll();
    }

    @DeleteMapping(path = "material/delete/{materialId}")
    public void delete(@PathVariable("materialId") long materialId){
        materialMasterService.delete(materialId);
    }

}
