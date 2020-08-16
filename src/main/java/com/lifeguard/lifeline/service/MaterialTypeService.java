package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.MaterialType;

import java.util.List;

public interface MaterialTypeService {
    MaterialType create(MaterialType materialType);

    List<MaterialType> getAll();

    void delete(Long materialTypeId);

    MaterialType get(Long materialTypeId);
}
