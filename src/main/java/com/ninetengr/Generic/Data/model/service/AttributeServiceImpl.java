package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.Attribute;
import com.ninetengr.Generic.Data.model.repository.AttributeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttributeServiceImpl implements AttributeService {

    private final AttributeRepository attributeRepository;

    public AttributeServiceImpl(AttributeRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }

    @Override
    public List<Attribute> getAllAttributes() {
        return attributeRepository.findAll();
    }

    @Override
    public Optional<Attribute> getAttributeById(Long id) {
        return attributeRepository.findById(id);
    }

    @Override
    public Attribute createAttribute(Attribute attribute) {
        return attributeRepository.save(attribute);
    }

    @Override
    public void deleteAttribute(Long id) {
        attributeRepository.deleteById(id);
    }
}
