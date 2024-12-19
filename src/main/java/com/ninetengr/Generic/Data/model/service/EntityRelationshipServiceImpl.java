package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.EntityRelationship;
import com.ninetengr.Generic.Data.model.repository.EntityRelationshipRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntityRelationshipServiceImpl implements EntityRelationshipService {

    private final EntityRelationshipRepository entityRelationshipRepository;

    public EntityRelationshipServiceImpl(EntityRelationshipRepository entityRelationshipRepository) {
        this.entityRelationshipRepository = entityRelationshipRepository;
    }

    @Override
    public List<EntityRelationship> getAllRelationships() {
        return entityRelationshipRepository.findAll();
    }

    @Override
    public Optional<EntityRelationship> getRelationshipById(Long id) {
        return entityRelationshipRepository.findById(id);
    }

    @Override
    public EntityRelationship createRelationship(EntityRelationship relationship) {
        return entityRelationshipRepository.save(relationship);
    }

    @Override
    public void deleteRelationship(Long id) {
        entityRelationshipRepository.deleteById(id);
    }
}
