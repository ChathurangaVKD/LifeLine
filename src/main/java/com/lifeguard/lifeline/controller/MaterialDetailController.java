package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.MaterialDetail;
import com.lifeguard.lifeline.service.MaterialDetailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MaterialDetailController {

    private MaterialDetailService materialDetailService;

    public MaterialDetailController(MaterialDetailService materialDetailService) {
        this.materialDetailService = materialDetailService;
    }

    @PostMapping(path = "/material/create-material-detail")
    public MaterialDetail create(@RequestBody MaterialDetail materialDetail) {
        return materialDetailService.create(materialDetail);
    }

    @GetMapping(path = "/material/get-material-detail/{materialId}")
    public MaterialDetail get(@PathVariable("materialId") Long materialId) {
        return materialDetailService.get(materialId);
    }

    @GetMapping(path = "/material/get-all-material-detail")
    public List<MaterialDetail> getAll() {
        return materialDetailService.getAll();
    }

    @DeleteMapping(path = "/material/delete-material-detail/{materialDetailId}")
    public void delete(@PathVariable("materialDetailId") Long materialDetailId) {
        materialDetailService.delete(materialDetailId);
    }
}
