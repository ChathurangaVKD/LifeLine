package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.MaterialType;
import com.lifeguard.lifeline.service.MaterialTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MaterialTypeController {

    private MaterialTypeService materialTypeService;

    public MaterialTypeController(MaterialTypeService materialTypeService) {
        this.materialTypeService = materialTypeService;
    }

    @PostMapping(path = "/material/create-material-type")
    public MaterialType create(@RequestBody MaterialType materialType) {
        return materialTypeService.create(materialType);
    }

    @GetMapping(path = "/material/get-all-material")
    public List<MaterialType> getAll() {
        return materialTypeService.getAll();
    }

    @DeleteMapping(path = "/material/delete-material-type/{materialTypeId}")
    public void delete(@PathVariable("materialTypeId") Long materialTypeId) {
        materialTypeService.delete(materialTypeId);
    }
}
