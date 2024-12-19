package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.EntityAttribute;

import java.util.List;
import java.util.Optional;

public interface EntityAttributeService {
    List<EntityAttribute> getAllEntityAttributes();
    Optional<EntityAttribute> getEntityAttributeById(Long id);
    EntityAttribute createEntityAttribute(EntityAttribute entityAttribute);
    void deleteEntityAttribute(Long id);
}
