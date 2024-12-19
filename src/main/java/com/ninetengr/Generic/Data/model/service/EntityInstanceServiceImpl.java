package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.EntityInstance;
import com.ninetengr.Generic.Data.model.repository.EntityInstanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntityInstanceServiceImpl implements EntityInstanceService {

    private final EntityInstanceRepository entityInstanceRepository;

    public EntityInstanceServiceImpl(EntityInstanceRepository entityInstanceRepository) {
        this.entityInstanceRepository = entityInstanceRepository;
    }

    @Override
    public List<EntityInstance> getAllInstances() {
        return entityInstanceRepository.findAll();
    }

    @Override
    public Optional<EntityInstance> getInstanceById(Long id) {
        return entityInstanceRepository.findById(id);
    }

    @Override
    public EntityInstance createInstance(EntityInstance instance) {
        return entityInstanceRepository.save(instance);
    }

    @Override
    public void deleteInstance(Long id) {
        entityInstanceRepository.deleteById(id);
    }
}
