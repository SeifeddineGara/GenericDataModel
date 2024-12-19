package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.AttributeValue;
import com.ninetengr.Generic.Data.model.repository.AttributeValueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttributeValueServiceImpl implements AttributeValueService {

    private final AttributeValueRepository attributeValueRepository;

    public AttributeValueServiceImpl(AttributeValueRepository attributeValueRepository) {
        this.attributeValueRepository = attributeValueRepository;
    }

    @Override
    public List<AttributeValue> getAllAttributeValues() {
        return attributeValueRepository.findAll();
    }

    @Override
    public Optional<AttributeValue> getAttributeValueById(Long id) {
        return attributeValueRepository.findById(id);
    }

    @Override
    public AttributeValue createAttributeValue(AttributeValue attributeValue) {
        return attributeValueRepository.save(attributeValue);
    }

    @Override
    public List<AttributeValue> createAttributeValues(List<AttributeValue> attributeValues) {
        return attributeValueRepository.saveAll(attributeValues);
    }

    @Override
    public void deleteAttributeValue(Long id) {
        attributeValueRepository.deleteById(id);
    }
}
