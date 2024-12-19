package com.ninetengr.Generic.Data.model.controller;

import com.ninetengr.Generic.Data.model.entity.AttributeValue;
import com.ninetengr.Generic.Data.model.service.AttributeValueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/attribute-values")
public class AttributeValueController {

    private final AttributeValueService attributeValueService;

    public AttributeValueController(AttributeValueService attributeValueService) {
        this.attributeValueService = attributeValueService;
    }

    @GetMapping
    public List<AttributeValue> getAllAttributeValues() {
        return attributeValueService.getAllAttributeValues();
    }

    @GetMapping("/{id}")
    public Optional<AttributeValue> getAttributeValueById(@PathVariable Long id) {
        return attributeValueService.getAttributeValueById(id);
    }

    @PostMapping
    public AttributeValue createAttributeValue(@RequestBody AttributeValue attributeValue) {
        return attributeValueService.createAttributeValue(attributeValue);
    }

    // Bulk insert for AttributeValues
    @PostMapping("/bulk")
    public List<AttributeValue> createAttributeValues(@RequestBody List<AttributeValue> attributeValues) {
        return attributeValueService.createAttributeValues(attributeValues);
    }

    @DeleteMapping("/{id}")
    public void deleteAttributeValue(@PathVariable Long id) {
        attributeValueService.deleteAttributeValue(id);
    }
}
