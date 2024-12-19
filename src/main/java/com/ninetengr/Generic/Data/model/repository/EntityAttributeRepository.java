package com.ninetengr.Generic.Data.model.repository;

import com.ninetengr.Generic.Data.model.entity.EntityAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityAttributeRepository extends JpaRepository<EntityAttribute, Long> {}
