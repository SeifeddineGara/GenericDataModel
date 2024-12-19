package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface BaseEntityService {
    List<BaseEntity> getAllBaseEntities();
    Optional<BaseEntity> getBaseEntityById(Long id);
    BaseEntity createBaseEntity(BaseEntity baseEntity);
    void deleteBaseEntity(Long id);
}
