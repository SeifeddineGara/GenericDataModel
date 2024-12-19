package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.EntityInstance;

import java.util.List;
import java.util.Optional;

public interface EntityInstanceService {
    List<EntityInstance> getAllInstances();
    Optional<EntityInstance> getInstanceById(Long id);
    EntityInstance createInstance(EntityInstance instance);
    void deleteInstance(Long id);
}
