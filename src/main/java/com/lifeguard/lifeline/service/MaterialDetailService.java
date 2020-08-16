package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.MaterialDetail;

import java.util.List;

public interface MaterialDetailService {
    MaterialDetail create(MaterialDetail materialDetail);

    MaterialDetail get(Long materialId);

    List<MaterialDetail> getAll();

    void delete(Long materialDetailId);
}
