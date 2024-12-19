package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.EntityRelationship;

import java.util.List;
import java.util.Optional;

public interface EntityRelationshipService {
    List<EntityRelationship> getAllRelationships();
    Optional<EntityRelationship> getRelationshipById(Long id);
    EntityRelationship createRelationship(EntityRelationship relationship);
    void deleteRelationship(Long id);
}
