package com.ninetengr.Generic.Data.model.controller;

import com.ninetengr.Generic.Data.model.entity.Attribute;
import com.ninetengr.Generic.Data.model.service.AttributeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/attributes")
public class AttributeController {

    private final AttributeService attributeService;

    public AttributeController(AttributeService attributeService) {
        this.attributeService = attributeService;
    }

    @GetMapping
    public List<Attribute> getAllAttributes() {
        return attributeService.getAllAttributes();
    }

    @GetMapping("/{id}")
    public Optional<Attribute> getAttributeById(@PathVariable Long id) {
        return attributeService.getAttributeById(id);
    }

    @PostMapping
    public Attribute createAttribute(@RequestBody Attribute attribute) {
        return attributeService.createAttribute(attribute);
    }

    @DeleteMapping("/{id}")
    public void deleteAttribute(@PathVariable Long id) {
        attributeService.deleteAttribute(id);
    }
}
