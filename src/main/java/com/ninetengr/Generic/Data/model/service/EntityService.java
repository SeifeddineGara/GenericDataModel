package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.EntityDefinition;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface EntityService {
    List<EntityDefinition> getAllEntities();
    Optional<EntityDefinition> getEntityById(Long id);
    EntityDefinition createEntity(EntityDefinition entity);
    void deleteEntity(Long id);
}
