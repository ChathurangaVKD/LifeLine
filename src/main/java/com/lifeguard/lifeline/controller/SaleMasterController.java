package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.SaleMaster;
import com.lifeguard.lifeline.service.SaleMasterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SaleMasterController {

    private SaleMasterService saleMasterService;

    public SaleMasterController(SaleMasterService saleMasterService) {
        this.saleMasterService = saleMasterService;
    }

    @PostMapping(path = "/Sale/create")
    public SaleMaster create(@RequestBody SaleMaster saleDetail) {
        return saleMasterService.create(saleDetail);
    }

    @GetMapping(path = "/sale/get-sale/{saleId}")
    public SaleMaster get(@PathVariable("saleId") Long saleId) {
        return saleMasterService.get(saleId);
    }

    @GetMapping(path = "/sale/get-all-sale")
    public List<SaleMaster> getAll() {
        return saleMasterService.getAll();
    }

    @DeleteMapping(path = "/sale/delete/{saleId}")
    public void delete(@PathVariable("saleId") Long saleId) {
        saleMasterService.delete(saleId);
    }
}
