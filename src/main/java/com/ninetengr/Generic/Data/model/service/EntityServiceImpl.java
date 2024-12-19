package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.EntityDefinition;
import com.ninetengr.Generic.Data.model.repository.EntityDefinitionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntityServiceImpl implements EntityService {

    private final EntityDefinitionRepository entityDefinitionRepository;

    public EntityServiceImpl(EntityDefinitionRepository entityDefinitionRepository) {
        this.entityDefinitionRepository = entityDefinitionRepository;
    }

    @Override
    public List<EntityDefinition> getAllEntities() {
        return entityDefinitionRepository.findAll();
    }

    @Override
    public Optional<EntityDefinition> getEntityById(Long id) {
        return entityDefinitionRepository.findById(id);
    }

    @Override
    public EntityDefinition createEntity(EntityDefinition entity) {
        return entityDefinitionRepository.save(entity);
    }

    @Override
    public void deleteEntity(Long id) {
        entityDefinitionRepository.deleteById(id);
    }
}
