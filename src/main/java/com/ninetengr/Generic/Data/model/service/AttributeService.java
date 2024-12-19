package com.ninetengr.Generic.Data.model.service;

import com.ninetengr.Generic.Data.model.entity.Attribute;

import java.util.List;
import java.util.Optional;

public interface AttributeService {
    List<Attribute> getAllAttributes();
    Optional<Attribute> getAttributeById(Long id);
    Attribute createAttribute(Attribute attribute);
    void deleteAttribute(Long id);
}
