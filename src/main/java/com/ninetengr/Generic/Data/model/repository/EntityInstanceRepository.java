package com.ninetengr.Generic.Data.model.repository;

import com.ninetengr.Generic.Data.model.entity.EntityInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityInstanceRepository extends JpaRepository<EntityInstance, Long> {}
