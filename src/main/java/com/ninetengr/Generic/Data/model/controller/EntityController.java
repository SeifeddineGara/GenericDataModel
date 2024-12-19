package com.ninetengr.Generic.Data.model.controller;

import com.ninetengr.Generic.Data.model.entity.EntityDefinition;
import com.ninetengr.Generic.Data.model.service.EntityService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/entities")

public class EntityController {


    private final EntityService entityService;

    public EntityController(EntityService entityService) {
        this.entityService = entityService;
    }

    @GetMapping
    public List<EntityDefinition> getAllEntities() {
        return entityService.getAllEntities();
    }

    @GetMapping("/{id}")
    public Optional<EntityDefinition> getEntityById(@PathVariable Long id) {
        return entityService.getEntityById(id);
    }

    @PostMapping
    public EntityDefinition createEntity(@RequestBody EntityDefinition entity) {
        return entityService.createEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable Long id) {
        entityService.deleteEntity(id);
    }
}
