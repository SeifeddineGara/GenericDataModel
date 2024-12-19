package com.ninetengr.Generic.Data.model.controller;

import com.ninetengr.Generic.Data.model.entity.EntityRelationship;
import com.ninetengr.Generic.Data.model.service.EntityRelationshipService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/relationships")
public class EntityRelationshipController {

    private final EntityRelationshipService entityRelationshipService;

    public EntityRelationshipController(EntityRelationshipService entityRelationshipService) {
        this.entityRelationshipService = entityRelationshipService;
    }

    @GetMapping
    public List<EntityRelationship> getAllRelationships() {
        return entityRelationshipService.getAllRelationships();
    }

    @GetMapping("/{id}")
    public Optional<EntityRelationship> getRelationshipById(@PathVariable Long id) {
        return entityRelationshipService.getRelationshipById(id);
    }

    @PostMapping
    public ResponseEntity<EntityRelationship> createRelationship(@RequestBody EntityRelationship entityRelationship) {
        EntityRelationship savedRelationship = entityRelationshipService.createRelationship(entityRelationship);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRelationship);
    }

    @DeleteMapping("/{id}")
    public void deleteRelationship(@PathVariable Long id)  {
        entityRelationshipService.deleteRelationship(id);
    }
}
