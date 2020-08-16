package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.SaleMaster;

import java.util.List;

public interface SaleMasterService {
    SaleMaster create(SaleMaster saleDetail);

    SaleMaster get(Long saleId);

    List<SaleMaster> getAll();

    void delete(Long saleId);
}
