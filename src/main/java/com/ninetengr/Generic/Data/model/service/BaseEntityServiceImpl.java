package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.BaseEntity;
import com.ninetengr.Generic.Data.model.repository.BaseEntityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BaseEntityServiceImpl implements BaseEntityService {

    private final BaseEntityRepository baseEntityRepository;

    public BaseEntityServiceImpl(BaseEntityRepository baseEntityRepository) {
        this.baseEntityRepository = baseEntityRepository;
    }

    @Override
    public List<BaseEntity> getAllBaseEntities() {
        return baseEntityRepository.findAll();
    }

    @Override
    public Optional<BaseEntity> getBaseEntityById(Long id) {
        return baseEntityRepository.findById(id);
    }

    @Override
    public BaseEntity createBaseEntity(BaseEntity baseEntity) {
        return baseEntityRepository.save(baseEntity);
    }

    @Override
    public void deleteBaseEntity(Long id) {
        baseEntityRepository.deleteById(id);
    }
}
