package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.EntityAttribute;
import com.ninetengr.Generic.Data.model.repository.EntityAttributeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntityAttributeServiceImpl implements EntityAttributeService {

    private final EntityAttributeRepository entityAttributeRepository;

    public EntityAttributeServiceImpl(EntityAttributeRepository entityAttributeRepository) {
        this.entityAttributeRepository = entityAttributeRepository;
    }

    @Override
    public List<EntityAttribute> getAllEntityAttributes() {
        return entityAttributeRepository.findAll();
    }

    @Override
    public Optional<EntityAttribute> getEntityAttributeById(Long id) {
        return entityAttributeRepository.findById(id);
    }

    @Override
    public EntityAttribute createEntityAttribute(EntityAttribute entityAttribute) {
        return entityAttributeRepository.save(entityAttribute);
    }

    @Override
    public void deleteEntityAttribute(Long id) {
        entityAttributeRepository.deleteById(id);
    }
}
