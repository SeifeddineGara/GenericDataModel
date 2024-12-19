package com.ninetengr.Generic.Data.model.controller;

import com.ninetengr.Generic.Data.model.entity.EntityAttribute;
import com.ninetengr.Generic.Data.model.service.EntityAttributeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/entity-attributes")
public class EntityAttributeController {

    private final EntityAttributeService entityAttributeService;

    public EntityAttributeController(EntityAttributeService entityAttributeService) {
        this.entityAttributeService = entityAttributeService;
    }

    @GetMapping
    public List<EntityAttribute> getAllEntityAttributes() {
        return entityAttributeService.getAllEntityAttributes();
    }

    @GetMapping("/{id}")
    public Optional<EntityAttribute> getEntityAttributeById(@PathVariable Long id) {
        return entityAttributeService.getEntityAttributeById(id);
    }

    @PostMapping
    public EntityAttribute createEntityAttribute(@RequestBody EntityAttribute entityAttribute) {
        return entityAttributeService.createEntityAttribute(entityAttribute);
    }

    @DeleteMapping("/{id}")
    public void deleteEntityAttribute(@PathVariable Long id) {
        entityAttributeService.deleteEntityAttribute(id);
    }
}
