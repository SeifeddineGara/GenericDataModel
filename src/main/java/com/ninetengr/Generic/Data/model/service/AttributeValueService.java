package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.AttributeValue;

import java.util.List;
import java.util.Optional;

public interface AttributeValueService {
    List<AttributeValue> getAllAttributeValues();
    Optional<AttributeValue> getAttributeValueById(Long id);
    AttributeValue createAttributeValue(AttributeValue attributeValue);
    public List<AttributeValue> createAttributeValues(List<AttributeValue> attributeValues);
    void deleteAttributeValue(Long id);
}
