package com.ninetengr.Generic.Data.model.controller;

import com.ninetengr.Generic.Data.model.entity.EntityInstance;
import com.ninetengr.Generic.Data.model.service.EntityInstanceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/instances")
public class EntityInstanceController {


    private final EntityInstanceService entityInstanceService;

    public EntityInstanceController(EntityInstanceService entityInstanceService) {
        this.entityInstanceService = entityInstanceService;
    }

    @GetMapping
    public List<EntityInstance> getAllInstances() {
        return entityInstanceService.getAllInstances();
    }

    @GetMapping("/{id}")
    public Optional<EntityInstance> getInstanceById(@PathVariable Long id) {
        return entityInstanceService.getInstanceById(id);
    }

    @PostMapping
    public EntityInstance createInstance(@RequestBody EntityInstance instance) {
        return entityInstanceService.createInstance(instance);
    }

    @DeleteMapping("/{id}")
    public void deleteInstance(@PathVariable Long id) {
        entityInstanceService.deleteInstance(id);
    }
}
