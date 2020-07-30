package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.MaterialMaster;

import java.util.List;

public interface MaterialMasterService {
    MaterialMaster create(MaterialMaster material);
    MaterialMaster get(Long materialId);
    List<MaterialMaster> getAll();
    void delete(Long materialId);
}
