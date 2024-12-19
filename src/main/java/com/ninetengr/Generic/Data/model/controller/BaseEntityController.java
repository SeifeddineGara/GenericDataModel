package com.ninetengr.Generic.Data.model.controller;

import com.ninetengr.Generic.Data.model.entity.BaseEntity;
import com.ninetengr.Generic.Data.model.service.BaseEntityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/base-entities")
public class BaseEntityController {

    private final BaseEntityService baseEntityService;

    public BaseEntityController(BaseEntityService baseEntityService) {
        this.baseEntityService = baseEntityService;
    }

    @GetMapping
    public List<BaseEntity> getAllBaseEntities() {
        return baseEntityService.getAllBaseEntities();
    }

    @GetMapping("/{id}")
    public Optional<BaseEntity> getBaseEntityById(@PathVariable Long id) {
        return baseEntityService.getBaseEntityById(id);
    }

    @PostMapping
    public BaseEntity createBaseEntity(@RequestBody BaseEntity baseEntity) {
        return baseEntityService.createBaseEntity(baseEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteBaseEntity(@PathVariable Long id) {
        baseEntityService.deleteBaseEntity(id);
    }
}
