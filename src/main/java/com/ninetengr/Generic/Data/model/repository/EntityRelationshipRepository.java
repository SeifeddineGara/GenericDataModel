package com.ninetengr.Generic.Data.model.repository;

import com.ninetengr.Generic.Data.model.entity.EntityRelationship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRelationshipRepository extends JpaRepository<EntityRelationship, Long> {}
